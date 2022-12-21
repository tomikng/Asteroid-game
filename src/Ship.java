import java.awt.*;

public class Ship implements GameObject {
    // Fields to store the ship's position, velocity, and other properties
    private int x, y;
    private int vx, vy;

    public Ship(int x, int y) {
        // Initialize the ship's position, velocity, and other properties
        this.x = x;
        this.y = y;
        vx = 0;
        vy = 0;
    }

    @Override
    public void update() {
        // Update the ship's position and velocity based on the elapsed time and user input
        x += vx;
        y += vy;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    @Override
    public void render(Graphics g) {
        // Set the color of the Graphics object to white
        g.setColor(Color.WHITE);

        // Define the points of the triangle
        int[] xPoints = {x, x + 10, x + 5};
        int[] yPoints = {y, y + 10, y + 20};

        // Draw the triangle on the screen using the points and the fillPolygon method
        g.fillPolygon(xPoints, yPoints, 3);
    }

}
