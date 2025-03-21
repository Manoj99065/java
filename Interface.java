interface one {
   int sum(int a, int b);
}

interface two {
   int sub(int x, int y);
}

class abc implements one, two {
   public int sub(int x, int y) {
      int z = x - y;
      return z;
   }

   public int sum(int a, int b) {
      int c = a + b;
      return c;
   }
}

class interface1 {
   public static void main(String args[]) {
      abc obj = new abc();
      abc obj1 = new abc();
      System.out.println("THe output of sum is = " + obj.sum(34, 24));
      System.out.println("THe output of sub is = " + obj1.sub(39, 23));
   }
}
