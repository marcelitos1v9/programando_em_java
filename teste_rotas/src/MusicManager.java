import javax.sound.sampled.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;

public class MusicManager {
    private String pacoteMusicas = "../musicas";

    public MusicManager(String pacoteMusicas) {
        this.pacoteMusicas = pacoteMusicas;
    }

    public void moverMusicaParaPacote(File arquivoDeMusica) {
        if (arquivoDeMusica.isFile()) {
            try {
                // Converter para WAV
                File arquivoWav = converterParaWav(arquivoDeMusica);

                // Mover para o pacote de músicas
                File diretorioPacote = new File(pacoteMusicas);
                if (!diretorioPacote.exists()) {
                    diretorioPacote.mkdir();
                }
                File destino = new File(diretorioPacote, arquivoWav.getName());
                Files.move(arquivoWav.toPath(), destino.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException | UnsupportedAudioFileException e) {
                e.printStackTrace();
            }
        }
    }

    private File converterParaWav(File arquivoMp3) throws IOException, UnsupportedAudioFileException {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(arquivoMp3);
        AudioFormat format = audioInputStream.getFormat();
        if (format.getEncoding() != AudioFormat.Encoding.PCM_SIGNED) {
            format = new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, format.getSampleRate(), 16,
                    format.getChannels(), format.getChannels() * 2, format.getSampleRate(), false);
            audioInputStream = AudioSystem.getAudioInputStream(format, audioInputStream);
        }

        // Criando o arquivo WAV
        File arquivoWav = new File(arquivoMp3.getParent(), arquivoMp3.getName().replace(".mp3", ".wav"));
        AudioSystem.write(audioInputStream, AudioFileFormat.Type.WAVE, arquivoWav);
        return arquivoWav;
    }

    public List<String> listarMusicas() {
        List<String> musicas = new ArrayList<>();
        File diretorio = new File(pacoteMusicas);
        if (diretorio.exists() && diretorio.isDirectory()) {
            File[] arquivos = diretorio.listFiles();
            for (File arquivo : arquivos) {
                if (arquivo.isFile() && arquivo.getName().endsWith(".wav")) {
                    musicas.add(arquivo.getName());
                }
            }
        }
        return musicas;
    }

    public File getArquivoMusica(String nomeMusica) {
        return new File(pacoteMusicas + File.separator + nomeMusica);
    }
}
