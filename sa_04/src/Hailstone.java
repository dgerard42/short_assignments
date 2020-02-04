import java.util.Scanner;

public class Hailstone {
    public int getUserInput(){
        System.out.println("please enter a non-zero number");
        Scanner keyboard = new Scanner(System.in);
        int n = 0;
        while (n == 0){
            if (keyboard.hasNextInt()) {
                n = keyboard.nextInt();
            }
            if (n == 0){
                keyboard.nextLine();
                System.out.println("invalid input, pls try again");
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Hailstone sequence = new Hailstone();
        int n = sequence.getUserInput();
        while (n != 1){
            System.out.println(n);
            if (n % 2 == 0)
                n = n / 2;
            else
                n = (3 * n) + 1;
        }
    }
}