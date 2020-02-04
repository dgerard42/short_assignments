import objectdraw.Line;
import objectdraw.WindowController;

public class Cube extends WindowController {

    static final int WIDTH = 500;
    static final int HEIGHT = 500;
    static final int FOV = 4;
    static final int EDGE = 10;

    public void begin() {

        int height = canvas.getHeight();
        int width = canvas.getWidth();

        new Line((width / EDGE), (height / FOV), (width - (width / FOV)), (height / FOV), canvas);
        new Line((width - (width / FOV)), (height / FOV), (width - (width / FOV)), (height - (height / EDGE)), canvas);
        new Line((width - (width / FOV)), (height - (height / EDGE)), (width / EDGE), (height - (height / EDGE)), canvas);
        new Line((width / EDGE), (height - (height / EDGE)), (width / EDGE), (height / FOV), canvas);
        new Line((width / EDGE), (height / FOV), ((width / EDGE) +(width / FOV)), (height / EDGE), canvas);
        new Line(((width / EDGE) +(width / FOV)), (height / EDGE), (width - (width / EDGE)), (height / EDGE), canvas);
        new Line((width - (width / EDGE)), (height / EDGE), (width - (width / FOV)), (height / FOV), canvas);
        new Line((width - (width / EDGE)), (height / EDGE), (width - (width / EDGE)), (height - (height / FOV)), canvas);
        new Line((width - (width / EDGE)), (height - (height / FOV)), (width - (width / FOV)), (height - (height / EDGE)), canvas);
    }

    public static void main(String[] args) {

        new Cube().startController(WIDTH, HEIGHT);
    }
}
