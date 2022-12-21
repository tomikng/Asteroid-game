public class Spaceship implements GameObject {
    private double x, y;
    private double vx, vy;
    private double size;

    public Spaceship(double x, double y) {
        this.x = x;
        this.y = y;
        this.vx = 0;
        this.vy = 0;
        this.size = 20;
    }

    public void update() {
        // Update the spaceship's position based on player input
        // You can use Keyboard.isKeyDown(Keyboard.KEY_LEFT) or similar
        // methods to check for player input
        if (Keyboard.isKeyDown(Keyboard.KEY_LEFT)) {
            vx -= 0.5;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_RIGHT)) {
            vx += 0.5;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_UP)) {
            vy -= 0.5;
        }
        if (Keyboard.isKeyDown(Keyboard.KEY_DOWN)) {
            vy += 0.5;
        }

        // Update the spaceship's position based on its velocity
        x += vx;
        y += vy;
    }

    public void render() {
        // Draw the spaceship on the screen
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getSize() {
        return size;
    }
}
