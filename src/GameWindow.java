import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class GameWindow {
    public static void main(String[] args) {
        // Create a new JFrame object, which represents the game window
        JFrame frame = new JFrame("Asteroid Game");

        // Set the size of the window
        frame.setSize(800, 600);

        // Set the default close operation for the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load the image of space
        ImageIcon spaceImage = new ImageIcon("img/space.jpg");

        // Create a JLabel to display the image
        JLabel spaceLabel = new JLabel(spaceImage);

        // Add the JLabel to the JFrame
        frame.add(spaceLabel);

        // Make the window visible
        frame.setVisible(true);
    }
}
