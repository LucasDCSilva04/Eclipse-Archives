import javax.swing.JFrame;
import javax.swing.Timer;

public class Game extends JFrame {
	
	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 470;
	public static final int DELAY = 90;
	
    private CharacterAnimation characterAnimation;

    public Game() {
    	characterAnimation = new CharacterAnimation();
        KeyboardInput keyboardInput = new KeyboardInput(characterAnimation);

        JFrame frame = new JFrame("Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.add(characterAnimation);
        frame.addKeyListener(keyboardInput);
        frame.setVisible(true);
    	
        Timer timer = new Timer(DELAY, e -> characterAnimation.update());
        timer.start();
            
    }

    public static void main(String[] args) {
        new Game();
    }

}
