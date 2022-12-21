public class Blackhole implements GameObject {
    private double x, y;
    private double mass;
    private double size;

    public Blackhole(double x, double y, double mass) {
        this.x = x;
        this.y = y;
        this.mass = mass;
        this.size = mass / 1000;
    }

    public void update() {
        // Update the black hole's size based on its mass
        size = mass / 1000;
    }

    public void render() {
        // Draw the black hole on the screen
    }

    public void attract(GameObject object) {
        // Calculate the gravitational force acting on the object
        // and update its velocity accordingly
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
