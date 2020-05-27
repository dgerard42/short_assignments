public class JumpIt {

   public static int jumpIt(int[] board, int n){

      if (n < 1)
         return 0;
      int branchA = board[n - 1] + jumpIt(board, n - 1);
      int branchB = board[n - 1] + jumpIt(board, n - 2);
      if (branchA < branchB)
         return branchA;
      return branchB;
   }

   public static void main(String args[]){

      int[] board00 = new int[] {0,3,80,6,59,10};
      int[] board01 = new int[] {0,3,10,50,90,100,3};
      int[] board02 = new int[] {0,2,90,100,80,70,3,40,20,60,80,10,3,50};
      System.out.println(jumpIt(board00, 6));
      System.out.println(jumpIt(board01, 7));
      System.out.println(jumpIt(board02, 14));
   }
}
