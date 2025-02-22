class static_method {
   static public int add(int a, int b) {
      return a + b;
   }
}

public class st {
   public static void main(String args[]) {
      int sum = static_method.add(20, 40);
      System.out.println("THe output is = " + sum);
   }
}
