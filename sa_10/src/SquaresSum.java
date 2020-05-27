public class SquaresSum {

    public static int squares(int n){
        if (n < 0)
            n = -n;
        if (n == 1 || n == 0)
            return 1;
        return ((n * n) + squares(n - 1));
    }

    public static void main(String args[]){

        System.out.println(squares(1));
        System.out.println(squares(2));
        System.out.println(squares(3));
        System.out.println(squares(0));
        System.out.println(squares(-1));
        System.out.println(squares(56));
        System.out.println(squares(-3));
    }
}
