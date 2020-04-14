public class ReverseStringPrinter {

    public static void ReversePrint(String toReverse) {

        if (toReverse.length() == 0) {
            System.out.print("\n");
            return;
        } else {
            System.out.print(toReverse.charAt(toReverse.length() - 1));
            ReversePrint(toReverse.substring(0, toReverse.length() - 1));
        }
    }

    public static void main(String args[]) {

        ReversePrint("hallo");
        ReversePrint("longer String with MORE characters!!!!");
    }
}
