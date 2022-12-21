import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Ship implements GameObject {
    // Ship position
    private double x;
    private double y;

    // Ship velocity
    private double vx;
    private double vy;

    // Ship acceleration
    private double ax;
    private double ay;

    // Ship shape
    private final Polygon shape;

    private final int WIDTH;
    private final int HEIGHT;

    public Ship(int x, int y) {
        WIDTH = x*2;
        HEIGHT = y*2;
        // Set the initial position of the ship
        this.x = x;
        this.y = y;

        // Set the initial velocity and acceleration to 0
        vx = 0;
        vy = 0;
        ax = 0;
        ay = 0;

        // Create the shape of the ship
        int[] xPoints = {-10, 10, 0};
        int[] yPoints = {10, 10, -10};
        shape = new Polygon(xPoints, yPoints, 3);
    }

    public void applyThrust(double thrustX, double thrustY) {
        ax += thrustX;
        ay += thrustY;
    }


    @Override
    public void update() {
        // Update the velocity of the ship based on its acceleration
        applyAcceleration();

        // Wrap the ship around the screen
        wrapAroundScreen(WIDTH, HEIGHT);

        enforceLimits(0.1, 1);

        // Update the position of the ship based on its velocity
        applyVelocity();
    }

    public void wrapAroundScreen(int screenWidth, int screenHeight) {
        // Wrap the ship around the screen
        if (x < 0) {
            x = screenWidth - 1;
        } else if (x > screenWidth - 1) {
            x = 0;
        }
        if (y < 0) {
            y = screenHeight - 1;
        } else if (y > screenHeight - 1) {
            y = 0;
        }
    }


    public void enforceLimits(double maxAcceleration, double maxVelocity) {
        // Check if the acceleration is above the maximum
        if (Math.abs(ax) > maxAcceleration) {
            // Set the acceleration to the maximum
            ax = Math.signum(ax) * maxAcceleration;
        }
        if (Math.abs(ay) > maxAcceleration) {
            // Set the acceleration to the maximum
            ay = Math.signum(ay) * maxAcceleration;
        }

        // Check if the velocity is above the maximum
        if (Math.abs(vx) > maxVelocity) {
            // Set the velocity to the maximum
            vx = Math.signum(vx) * maxVelocity;
        }
        if (Math.abs(vy) > maxVelocity) {
            // Set the velocity to the maximum
            vy = Math.signum(vy) * maxVelocity;
        }
    }


    private void applyVelocity() {
        // Update the velocity based on the acceleration
        vx += ax;
        vy += ay;
    }

    private void applyAcceleration() {
        // Update the position based on the velocity
        x += vx;
        y += vy;
    }

    public void setAcceleration(double ax, double ay) {
        // Set the acceleration of the object
        this.ax = ax;
        this.ay = ay;
    }


    @Override
    public void render(Graphics g) {


        // Translate the coordinate system to the position of the ship
        g.translate((int) x, (int) y);

        // Set the color of the ship
        g.setColor(Color.WHITE);

        // Fill the ship shape
        g.fillPolygon(shape);


    }
}
