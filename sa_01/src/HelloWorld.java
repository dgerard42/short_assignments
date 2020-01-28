import objectdraw.*;

public class HelloWorld extends WindowController{

    public void onMousePress(Location point){
        new Text("HELLO WORLD!", 150, 200, canvas);
    }

    public static void main(String[] args){
        new HelloWorld().startController(400, 400);
    }
}
