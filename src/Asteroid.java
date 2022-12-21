public class Asteroid implements GameObject {
    private double x, y;
    private double vx, vy;
    private double  size;

    public Asteroid(double x, double y, double vx, double vy, double size) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.size = size;
    }

    public void update() {
        // Update the asteroid's position based on its velocity
        x += vx;
        y += vy;
    }

    public void render() {
        // Draw the asteroid on the screen
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
