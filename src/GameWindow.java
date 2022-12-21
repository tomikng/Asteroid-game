import javax.swing.JFrame;

public class GameWindow {
    public static void main(String[] args) throws InterruptedException {
        int WIDTH = 800;
        int HEIGHT = 600;
        // Create a new JFrame object, which represents the game window
        JFrame frame = new JFrame("Asteroid Game");

        // Set the size of the window
        frame.setSize(WIDTH, HEIGHT);

        // Set the default close operation for the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a new Game object
        Game game = new Game(WIDTH, HEIGHT, frame);
        game.requestFocus();

        // Add the Game object to the JFrame as a content pane
        frame.setContentPane(game);

// Make the window visible
        frame.setVisible(true);

// Start the game loop
        game.run();
    }
}
