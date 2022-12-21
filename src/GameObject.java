import java.awt.*;

public interface GameObject {
    void update();
    void render(Graphics g);
    double getX();
    double getY();
}
