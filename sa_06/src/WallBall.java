import objectdraw.*;

public class WallBall extends WindowController {

    private static final int CANVAS_WIDTH = 500;
    private static final int CANVAS_HEIGHT = 500;
    private static final int START_X = 50;
    private static final int START_Y = 150;

    public void begin(){

        Location start = new Location(START_X, START_Y);
        BouncyBall bounce = new BouncyBall(start, canvas, CANVAS_WIDTH, CANVAS_HEIGHT);
    }

    public static void main(String args[]){

        new WallBall().startController(CANVAS_WIDTH, CANVAS_HEIGHT);
    }
}
