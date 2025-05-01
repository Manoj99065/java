class inheritance1 {
   void display() {
      System.out.println("This is base class");
   }
}

class man extends inheritance1 {
   void show() {
      System.out.println("This is the second subclass");
   }
}

public class inheritanc1 {

   public static void main(String args[]) {
      man Man = new man();
      Man.display();
      Man.show();
   }
}
