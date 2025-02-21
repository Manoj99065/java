import java.util.Scanner;

public class Daynamic_matrix_multiplication {
   public static void main(String args[]) {
      int r1, r2, c1, c2;
      int arr1[][] = new int[10][10];
      int arr2[][] = new int[10][10];
      int arr3[][] = new int[10][10];

      Scanner sca = new Scanner(System.in);
      System.out.println("Enter the size of the matrix one :");
      System.out.print("Enter size of row = ");
      r1 = sca.nextInt();
      System.out.print("Enter size of column = ");
      r2 = sca.nextInt();
      for (int i = 1; i <= r1; i++) {
         for (int j = 1; j <= r2; j++) {
            System.out.print("Enter the element in first matrix " + i + "," + j + "= ");
            arr1[i][j] = sca.nextInt();

         }
      }

      System.out.println("\nEnter the size of the matrix :");
      {
         System.out.print("Enter size of row = ");
         c1 = sca.nextInt();
         System.out.print("Enter size of column = ");
         c2 = sca.nextInt();

         for (int i = 1; i <= c1; i++) {
            for (int j = 1; j <= c2; j++) {
               System.out.print("Enter the element in position  " + i + "," + j + "= ");
               arr2[i][j] = sca.nextInt();
            }
         }

      }

      // in this multiplication of the given matrix:
      for (int i = 1; i <= r1; i++) {
         for (int j = 1; j <= c2; j++) {
            arr3[i][j] = 0;
            for (int k = 1; k <= c2; k++) {
               arr3[i][j] += arr1[i][k] * arr2[k][j];
            }

         }
      }

      System.out.println("THE output of the given array :");
      for (int i = 1; i <= r1; i++) {
         for (int j = 1; j <= c2; j++) {
            System.out.print(arr3[i][j] + " ");
         }
         System.out.println(" ");
      }

   }
}
