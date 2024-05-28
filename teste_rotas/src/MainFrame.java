import javax.swing.*;

public class MainFrame {
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
