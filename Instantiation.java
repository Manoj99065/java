class instatiation {
   String brand;

   instatiation(String hello) {
      this.brand = hello;

   }

   void display() {
      System.out.println("THe name of the car is = " + brand);
   }
}

public class main {
   public static void main(String args[]) {
      instatiation mycar = new instatiation("Tyota");
      mycar.display();

   }
}
