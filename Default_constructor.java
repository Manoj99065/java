class abc {
   String name;

   public abc() {
      name = "unkown";
   }

   void display() {
      System.out.println(name);
   }

}

public class constructor_default {
   public static void main(String args[]) {
      abc obj = new abc();
      obj.display();

   }
}
