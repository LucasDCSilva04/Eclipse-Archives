import java.awt.Dimension;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        // cria a janela
        JFrame janela = new JFrame("Animação com 8 imagens");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // cria o painel
        ImagemAnimadaPanel painel = new ImagemAnimadaPanel();

        // adiciona o painel à janela
        janela.getContentPane().add(painel);

        // ajusta o tamanho da janela de acordo com as dimensões da imagem
        janela.pack();
        // define as dimensões do painel
        painel.setPreferredSize(new Dimension(800, 600));

        // define as dimensões da janela
        janela.setSize(800, 600);
        // torna a janela visível
        janela.setVisible(true);
    }

}