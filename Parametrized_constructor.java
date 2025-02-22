class abc {
   String name;
   int age;

   public abc(String a, int b) {
      name = a;
      age = b;
   }

   void display() {
      System.out.println("The name of the studnet is = " + name);
      System.out.println("The name of the studnet is = " + age);

   }
}

class Parametrized_constructor {
   public static void main(String args[]) {
      abc obj = new abc("manoj", 394);
      obj.display();

   }
}
