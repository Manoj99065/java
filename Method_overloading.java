class method {

   int show1(int k, int l) {
      int i = k + l;
      return i;
   }

   int show1(int s, int j, int k) {
      int t = s - j + k;
      return t;
   }

}

class method_o {
   public static void main(String args[]) {
      method obj = new method();
      System.out.println(obj.show1(30, 20));
      method obj1 = new method();
      System.out.println(obj1.show1(49, 44, 43));
   }
}
