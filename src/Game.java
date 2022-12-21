import java.awt.*;
import java.util.ArrayList;
import javax.swing.JComponent;

public class Game extends JComponent {
    // Array to store the game objects
    private ArrayList<GameObject> gameObjects;


    public Game(int width, int length) {
        gameObjects = new ArrayList<GameObject>();

        // Add a ship to the game
        Ship ship = new Ship(width / 2, length/2);
        gameObjects.add(ship);
    }

    public void drawBackground(Graphics g) {
        // Cast the Graphics object to a Graphics2D object
        Graphics2D g2d = (Graphics2D) g;

        // Create a gradient from dark blue to black
        GradientPaint gradient = new GradientPaint(0, 0, new Color(0, 0, 128), 0, getHeight(), Color.BLACK);

        // Set the paint of the Graphics2D object to the gradient
        g2d.setPaint(gradient);

        // Fill the screen with the gradient to create the background of space
        g2d.fillRect(0, 0, getWidth(), getHeight());

        // Set the color of the Graphics2D object to white
        g2d.setColor(Color.WHITE);
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        drawBackground(g);

        // Render all game objects
        for (GameObject obj : gameObjects) {
            obj.render(g);
        }
    }

    public void run() {
        // Main game loop
        while (true) {
            // Update all game objects
            for (GameObject obj : gameObjects) {
                obj.update();
            }

            // Repaint the game
            repaint();
        }
    }
}
