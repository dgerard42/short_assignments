public class PallindromeChecker {

    public static Boolean PallindromeChecker(String toCheck) {

        if (toCheck.length() == 0 || toCheck.length() == 1) {
            return true;
        } else if (toCheck.charAt(0) == toCheck.charAt(toCheck.length() - 1)) {
            return PallindromeChecker(toCheck.substring(1, toCheck.length() - 1));
        } else {
            return false;
        }
    }

    public static void main(String args[]) {

        System.out.println(PallindromeChecker("tacocat"));
        System.out.println(PallindromeChecker("abutttuba"));
        System.out.println(PallindromeChecker("yeet"));
    }
}
