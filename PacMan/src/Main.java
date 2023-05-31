import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel implements KeyListener {
    private Pacman pacman;

    public Main() {
        pacman = new Pacman(50, 50, 30, 30, 5);
        addKeyListener(this);
        setFocusable(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.yellow);
        g.fillOval(pacman.getX(), pacman.getY(), pacman.getWidth(), pacman.getHeight());
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                pacman.moveUp();
                break;
            case KeyEvent.VK_DOWN:
                pacman.moveDown();
                break;
            case KeyEvent.VK_LEFT:
                pacman.moveLeft();
                break;
            case KeyEvent.VK_RIGHT:
                pacman.moveRight();
                break;
        }
        repaint();
    }

    public void keyTyped(KeyEvent e) {}
}