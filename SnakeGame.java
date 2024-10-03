import javax.swing.JFrame;

public class SnakeGame extends JFrame {
    
    public SnakeGame() {
        // Initialize the game window
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        // Add the game panel where the game will be drawn
        add(new GamePanel());
        
        // Pack the components within the window
        pack();
        
        // Make the window visible
        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    public static void main(String[] args) {
        // Start the Snake game
        new SnakeGame();
    }
}
