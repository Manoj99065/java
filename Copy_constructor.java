class abc {
   String name;

   abc(String name1) {
      name = name1;

   }

   abc(abc p) {
      name = p.name;
   }

   void display() {
      System.out.println("THe output of the given point is = " + name);
   }
}

class copy_constructor {
   public static void main(String args[]) {
      abc obj = new abc("manoj");
      obj.display();
      abc obj1 = new abc(obj);
      obj1.display();

   }
}
