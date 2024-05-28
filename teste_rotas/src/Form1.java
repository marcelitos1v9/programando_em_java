import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Form1 extends JFrame {
    private JButton selectButton;
    private MusicManager musicManager;

    public Form1(MusicManager musicManager) {
        this.musicManager = musicManager;

        setTitle("Selecione uma música");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        selectButton = new JButton("Selecionar Música");
        selectButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    musicManager.moverMusicaParaPacote(selectedFile);
                    JOptionPane.showMessageDialog(null, "Música selecionada e movida para o pacote de músicas.");
                    abrirForm2();
                }
            }
        });

        setLayout(new FlowLayout());
        add(selectButton);

        setVisible(true);
    }

    private void abrirForm2() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Player de Música");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(new Form2(musicManager));
                frame.pack();
                frame.setVisible(true);
                dispose(); // Fechar a tela atual (Form1)
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MusicManager musicManager = new MusicManager("musicas");
                new Form1(musicManager);
            }
        });
    }
}
