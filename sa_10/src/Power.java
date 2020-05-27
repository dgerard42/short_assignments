public class Power {

    public static int power(int x, int n){
        if (n == 0)
            return 1;
        return (x * power(x, n - 1));
    }

    public static void main(String args[]){

        System.out.println(power(2, 4));
        System.out.println(power(2, 2));
        System.out.println(power(2, 1));
        System.out.println(power(2, 0));
        System.out.println(power(7, 2));
        System.out.println(power(3, 12));
    }
}
