import javax.swing.*;
import javax.sound.sampled.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Form2 extends JPanel {
    private MusicManager musicManager;
    private JList<String> musicList;
    private JButton playButton;
    private JButton pauseButton;
    private JButton stopButton;
    private JLabel statusLabel;

    private Clip currentClip;
    private boolean isPlaying;
    private boolean isPaused;
    private long clipTimePosition;

    public Form2(MusicManager musicManager) {
        this.musicManager = musicManager;

        musicList = new JList<>();
        playButton = new JButton("Tocar");
        pauseButton = new JButton("Pausar");
        stopButton = new JButton("Parar");
        statusLabel = new JLabel("Selecione uma música para tocar.");

        atualizarListaDeMusicas();

        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String musicaSelecionada = musicList.getSelectedValue();
                if (musicaSelecionada != null) {
                    File arquivoDeMusica = musicManager.getArquivoMusica(musicaSelecionada);
                    tocarMusica(arquivoDeMusica);
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione uma música para tocar.");
                }
            }
        });

        pauseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isPlaying && currentClip != null) {
                    clipTimePosition = currentClip.getMicrosecondPosition();
                    currentClip.stop();
                    isPaused = true;
                    isPlaying = false;
                    statusLabel.setText("Pausado");
                }
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentClip != null) {
                    currentClip.stop();
                    currentClip.close();
                    isPlaying = false;
                    isPaused = false;
                    clipTimePosition = 0;
                    statusLabel.setText("Parado");
                }
            }
        });

        this.setLayout(new BorderLayout());
        JPanel controlPanel = new JPanel();
        controlPanel.add(playButton);
        controlPanel.add(pauseButton);
        controlPanel.add(stopButton);

        this.add(new JScrollPane(musicList), BorderLayout.CENTER);
        this.add(controlPanel, BorderLayout.SOUTH);
        this.add(statusLabel, BorderLayout.NORTH);
    }

    public void atualizarListaDeMusicas() {
        List<String> arquivosDeMusica = musicManager.listarMusicas();
        musicList.setListData(arquivosDeMusica.toArray(new String[0]));
    }

    private void tocarMusica(File arquivoDeMusica) {
        if (!arquivoDeMusica.exists() || !arquivoDeMusica.isFile()) {
            JOptionPane.showMessageDialog(null, "Arquivo de música não encontrado.");
            return;
        }

        try {
            if (currentClip != null && currentClip.isOpen()) {
                currentClip.close();
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(arquivoDeMusica);
            currentClip = AudioSystem.getClip();
            currentClip.open(audioStream);
            currentClip.start();
            isPlaying = true;
            isPaused = false;
            statusLabel.setText("Reproduzindo: " + arquivoDeMusica.getName());

            currentClip.addLineListener(new LineListener() {
                @Override
                public void update(LineEvent event) {
                    if (event.getType() == LineEvent.Type.STOP && !isPaused) {
                        statusLabel.setText("Parado");
                        currentClip.close();
                        isPlaying = false;
                    }
                }
            });

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            JOptionPane.showMessageDialog(null, "Erro ao reproduzir o arquivo: " + arquivoDeMusica.getName());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MusicManager musicManager = new MusicManager("musicas");
                JFrame frame = new JFrame("Player de Música");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new Form2(musicManager));
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
