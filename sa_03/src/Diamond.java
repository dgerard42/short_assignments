import objectdraw.*;

public class Diamond extends WindowController {

    static final int WIDTH = 500;
    static final int HEIGHT = 300;
    static final int RATE_OF_GROWTH = 1;
    private int size = 0;

    public void begin() {
        new Line((WIDTH / 2), 0, WIDTH, (HEIGHT / 2), canvas);
        new Line(WIDTH, (HEIGHT / 2), (WIDTH / 2), HEIGHT, canvas);
        new Line((WIDTH / 2), HEIGHT, 0, (HEIGHT / 2 ), canvas);
        new Line(0, (HEIGHT / 2), (WIDTH / 2), 0, canvas);
    }

    public void onMouseClick(Location point) {
        canvas.clear();
        size += RATE_OF_GROWTH;
        new Line((WIDTH / 2), 0 - size, WIDTH + size, (HEIGHT / 2), canvas);
        new Line(WIDTH + size, (HEIGHT / 2), (WIDTH / 2), HEIGHT + size, canvas);
        new Line((WIDTH / 2), HEIGHT + size, 0 - size, (HEIGHT / 2), canvas);
        new Line(0 - size, (HEIGHT / 2), (WIDTH / 2), 0 - size, canvas);
    }

    public static void main(String[] args) {
        new Diamond().startController(WIDTH, HEIGHT);
    }
}