import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class Game extends JComponent implements KeyListener {
    // Array to store the game objects
    private ArrayList<GameObject> gameObjects;

    private Ship ship;

    public Game(int width, int length, JFrame frame) {
        gameObjects = new ArrayList<GameObject>();

        // Add a ship to the game
        ship = new Ship(width / 2, length/2);
        gameObjects.add(ship);

        // Add the Game object as a key listener to the JFrame
        frame.addKeyListener(this);
    }

    // Implement the KeyListener interface methods
    @Override
    public void keyPressed(KeyEvent e) {
        // Get the key code of the pressed key
        int keyCode = e.getKeyCode();

        // Check if the W key is pressed
        if (keyCode == KeyEvent.VK_W ) {
            // Apply a thrust upwards
            ship.applyThrust(0, -0.1);
        }

        // Check if the A key is pressed
        if (keyCode == KeyEvent.VK_A) {
            // Apply a thrust to the left
            ship.applyThrust(-0.1, 0);
        }
        // Check if the S key is pressed
        if (keyCode == KeyEvent.VK_S) {
            // Apply a thrust downwards
            ship.applyThrust(0, 0.1);
        }

// Check if the D key is pressed
        if (keyCode == KeyEvent.VK_D) {
            // Apply a thrust to the right
            ship.applyThrust(0.1, 0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Get the key code of the released key
        int keyCode = e.getKeyCode();

        // Check if the W key is released
        if (keyCode == KeyEvent.VK_W) {
            // Reset the acceleration of the ship
            ship.setAcceleration(0, 0);
        }

        // Check if the A key is released
        if (keyCode == KeyEvent.VK_A) {
            // Reset the acceleration of the ship
            ship.setAcceleration(0, 0);
        }

        // Check if the S key is released
        if (keyCode == KeyEvent.VK_S) {
            // Reset the acceleration of the ship
            ship.setAcceleration(0, 0);
        }

        // Check if the D key is released
        if (keyCode == KeyEvent.VK_D) {
            // Reset the acceleration of the ship
            ship.setAcceleration(0, 0);
        }
    }


    @Override
    public void keyTyped(KeyEvent e) {
        // Handle key type events here
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

    public void run() throws InterruptedException {
        // Main game loop
        while (true) {
            ship.update();

            // Repaint the game
            repaint();

            // Sleep for a short time
            Thread.sleep(20);
        }
    }
}

