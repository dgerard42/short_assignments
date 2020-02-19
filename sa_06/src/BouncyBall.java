import objectdraw.*;

public class BouncyBall extends ActiveObject {

    private static final int BALL_SIZE = 20;
    private static final int WALL_SIZE = 10;
    private static final int BALL_SPEED = 10;

    private FilledOval bouncy;
    private FilledRect wallNorth;
    private FilledRect wallEast;
    private FilledRect wallWest;
    private FilledRect wallSouth;
    private DrawingCanvas enviroment;

    public BouncyBall(Location start, DrawingCanvas oldCanvas, int roomSizeX, int roomSizeY){

        enviroment = oldCanvas;
        bouncy = new FilledOval(start, BALL_SIZE, BALL_SIZE, enviroment);
        wallNorth = new FilledRect(0, 0, roomSizeX, WALL_SIZE, enviroment);
        wallEast = new FilledRect(0, 0, WALL_SIZE, roomSizeY, enviroment);
        wallWest = new FilledRect(roomSizeX - WALL_SIZE, 0, WALL_SIZE, roomSizeY, enviroment);
        wallSouth = new FilledRect(0, roomSizeY - WALL_SIZE, roomSizeX, WALL_SIZE, enviroment);
        start();
    }

    public void run(){

        int xMove = 1;
        int yMove = 1;

        while (true) {
            if (bouncy.overlaps(wallNorth)) {
               yMove = 1;
            } else if (bouncy.overlaps(wallEast)) {
                xMove = 1;
            } else if (bouncy.overlaps(wallWest)) {
                xMove = -1;
            } else if (bouncy.overlaps(wallSouth)){
                yMove = -1;
            }
            bouncy.move(xMove, yMove);
            pause(BALL_SPEED);
        }
    }
}
