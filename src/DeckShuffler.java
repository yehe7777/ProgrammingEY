public class DeckShuffler {

 private static final int shuffleCount = 1;    
 private static final int valueCount = 4;      


 public static void main(String[] args) {
  System.out.println("Results of " + shuffleCount +
         " consecutive perfect shuffles:");
  int[] values1 = new int[valueCount];
  for (int i = 0; i < values1.length; i++) {
   values1[i] = i;
   }
  for (int j = 1; j <= shuffleCount; j++) {
   perfectShuffle(values1);
   System.out.print("  " + j + ":");
   for (int k = 0; k < values1.length; k++) {
    System.out.print(" " + values1[k]);
   }
   System.out.println();
  }
  System.out.println();

  System.out.println("Results of " + shuffleCount +
         " consecutive efficient selection shuffles:");
  int[] values2 = new int[valueCount];
  for (int i = 0; i < values2.length; i++) {
   values2[i] = i;
   }
  for (int j = 1; j <= shuffleCount; j++) {
   selectionShuffle(values2);
   System.out.print("  " + j + ":");
   for (int k = 0; k < values2.length; k++) {
    System.out.print(" " + values2[k]);
   }
   System.out.println();
  }
  System.out.println();
 }



 public static void perfectShuffle(int[] values) {
  int[] temp = new int[values.length];
  int mid = (values.length + 1) / 2;


  int unshuffledPos = 0;
  int k = 0;
  for ( ; k < mid; k++) {
   temp[unshuffledPos] = values[k];
   unshuffledPos += 2;
  }
  unshuffledPos = 1;
  for ( ; k < values.length; k++) {
   temp[unshuffledPos] = values[k];
   unshuffledPos += 2;
  }

  
  for (k = 0; k < values.length; k++) {
   values[k] = temp[k];
  }
 }

 
 public static void selectionShuffle(int[] values) {
  for (int k = values.length - 1; k > 0; k--) {
   int pos = (int) (Math.random() * (k + 1));  // range 0 to k, inclusive
   int temp = values[pos];
   values[pos] = values[k];
   values[k] = temp;
  }
 }
}

