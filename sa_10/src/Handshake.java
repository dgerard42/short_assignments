public class Handshake {

    public static int handshake(int n){

        if (n <= 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return ((n - 1) + handshake(n - 1));
    }

    public static void main(String args[]){

        System.out.println(handshake(0));
        System.out.println(handshake(1));
        System.out.println(handshake(2));
        System.out.println(handshake(3));
        System.out.println(handshake(4));
        System.out.println(handshake(5));
    }
}
