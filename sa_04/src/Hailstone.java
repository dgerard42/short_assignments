import java.util.Scanner;

public class Hailstone extends {

    public int getUserInput(){
        Scanner keyboard = new Scanner(System.in);
        
    }

    public static void main(String[] args) {
        new Hailstone();
        int n = getUserInput();
        while (n != 1){
            System.out.println(n);
            if (n % 2 == 0)
                n = n / 2;
            else
                n = (3 * n) + 1;
        }
    }
}