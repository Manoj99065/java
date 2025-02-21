class matrix_multiplication {
   public static void main(String args[]) {
      int i, j, k;
      int arr[][] = { { 1, 3 }, { 2, 5 } };
      int arr1[][] = { { 3, 4 }, { 3, 5 } };
      int arr2[][] = new int[2][2];

      for (i = 0; i < 2; i++) {
         for (j = 0; j < 2; j++) {
            arr2[i][j] = 0;
            for (k = 0; k < 2; k++) {

               arr2[i][j] += arr[i][k] * arr1[k][j];

               // System.out.println("The array is " + arr2[i][j]);

            }
            // }
         }
      }
      System.out.println("THe resulting matrix is :");
      for (i = 0; i < 2; i++) {
         for (j = 0; j < 2; j++) {
            System.out.println("THe array is = " + arr2[i][j]);
         }
         System.out.println("");
      }
   }
}
