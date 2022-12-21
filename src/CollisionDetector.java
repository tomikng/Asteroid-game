public class CollisionDetector {
    public static boolean areColliding(GameObject object1, GameObject object2) {
        // Calculate the distance between the two objects
        double dx = object1.getX() - object2.getX();
        double dy = object1.getY() - object2.getY();
        double distance = Math.sqrt(dx * dx + dy * dy);

        // Calculate the sum of the sizes of the two objects
        double size = object1.getSize() + object2.getSize();

        // If the distance is smaller than the sum of the sizes,
        // the objects are colliding
        return distance < size;
    }
}
