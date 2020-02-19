import objectdraw.*;
import java.awt.*;
import java.util.Random;

public class FunkyWindow extends WindowController {

    private static final int CANVAS_HEIGHT = 600;
    private static final int CANVAS_WIDTH = 500;

    private FilledRect left;
    private FilledRect right;

    public void begin(){

        Random rng = new Random();
        Color leftColor = new Color(rng.nextInt(255), rng.nextInt(255), rng.nextInt(255));
        Color rightColor = new Color(rng.nextInt(255), rng.nextInt(255), rng.nextInt(255));

        left = new FilledRect(0,0, CANVAS_WIDTH / 2, CANVAS_HEIGHT , canvas);
        right = new FilledRect(CANVAS_WIDTH / 2,0, CANVAS_WIDTH / 2, CANVAS_HEIGHT, canvas);
        left.setColor(leftColor);
        right.setColor(rightColor);
    }

    public void onMouseClick (Location point){

        Random rng = new Random();
        Color newColor = new Color(rng.nextInt(255), rng.nextInt(255), rng.nextInt(255));
        if (point.getX() < CANVAS_WIDTH / 2)
            left.setColor(newColor);
        else
            right.setColor(newColor);
    }

    public static void main(String args[]){

        new FunkyWindow().startController(CANVAS_WIDTH, CANVAS_HEIGHT);
    }
}
