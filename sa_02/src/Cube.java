import objectdraw.Line;
import objectdraw.WindowController;

public class Cube extends WindowController {

    static final int WIDTH = 500;
    static final int HEIGHT = 300;

    public void begin() {

        int height = canvas.getHeight();
        int width = canvas.getWidth();

        new Line();
    }

    public static void main(String[] args) {

        new Cube().startController(WIDTH, HEIGHT);
    }
}
