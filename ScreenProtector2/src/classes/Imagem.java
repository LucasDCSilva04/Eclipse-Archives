package classes;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Imagem extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;
    private static final int INTERVALO = 90; // intervalo de tempo entre as imagens em milissegundos
    private static final int TOTAL_IMAGENS = 8; // número total de imagens
    private int indiceImagemAtual = 0; // índice da imagem atual
    private Image[] imagens = new Image[TOTAL_IMAGENS]; // array de imagens
    private Timer timer; // temporizador para controlar o intervalo entre as imagens

    public Imagem() {
        // carrega as imagens
        for (int i = 0; i < TOTAL_IMAGENS; i++) {
            try {
                imagens[i] = ImageIO.read(getClass().getResource("/imagem/Walk" + (i + 1) + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        // inicia o temporizador
        timer = new Timer(INTERVALO, this);
        timer.setInitialDelay(0);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagens[indiceImagemAtual], 0, 0, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // atualiza o índice da imagem atual
        indiceImagemAtual = (indiceImagemAtual + 1) % TOTAL_IMAGENS;

        // redesenha o painel
        repaint();
    }

}
