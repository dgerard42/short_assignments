import objectdraw.*;

public class Diamond extends WindowController {

    static final int WIDTH = 500;
    static final int HEIGHT = 300;

    public void begin() {

        int height = canvas.getHeight();
        int width = canvas.getWidth();

        new Line((width / 2), 0, width, (height / 2), canvas);
        new Line(width, (height / 2), (width / 2), height, canvas);
        new Line((width / 2), height, 0, (height / 2 ), canvas);
        new Line(0, (height / 2), (width / 2), 0, canvas);
        new Line (((width / 2) / 2), ((height / 2) / 2), ((width + (width / 2)) / 2), ((height + (height / 2)) / 2), canvas);
        new Line ((((width / 2) + width) / 2), ((height / 2) / 2), ((width / 2) / 2), (((height / 2) + height) / 2), canvas);
    }

    public static void main(String[] args) {

        new Diamond().startController(WIDTH, HEIGHT);
    }
}
