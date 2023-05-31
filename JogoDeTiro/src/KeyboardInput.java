import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardInput implements KeyListener {

    static private CharacterAnimation characterAnimation;

    public KeyboardInput(CharacterAnimation characterAnimation) {
        this.characterAnimation = characterAnimation;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_W) {
            characterAnimation.setMovingUp(true);
        } else if (keyCode == KeyEvent.VK_A) {
            characterAnimation.setMovingLeft(true);
        } else if (keyCode == KeyEvent.VK_S) {
            characterAnimation.setMovingDown(true);
        } else if (keyCode == KeyEvent.VK_D) {
            characterAnimation.setMovingRight(true);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_W) {
            characterAnimation.setMovingUp(false);
        } else if (keyCode == KeyEvent.VK_A) {
            characterAnimation.setMovingLeft(false);
        } else if (keyCode == KeyEvent.VK_S) {
            characterAnimation.setMovingDown(false);
        }else if (keyCode == KeyEvent.VK_D) {
        	characterAnimation.setMovingRight(false);
        }
        }public void keyTyped(KeyEvent e) {
            // do nothing
        }
}
