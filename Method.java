class abc {
   abc(int a, int b) {
      int c = a + b;
      System.out.println("THe sum " + c);
   }
}

class method {
   public static void main(String args[]) {
      int x = 10, y = 40;
      abc obj = new abc(x, y);

   }
}
