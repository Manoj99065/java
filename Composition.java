class engine {
   void start() {
      System.out.println("Engine started ");

   }
}


class car {
   public engine Engine = new engine();

   void startcar() {
      Engine.start();
      System.out.println("Car is moving");

   }
}

public class composition {
   public static void main(String args[]) {
      car Car = new car();
      Car.startcar();
   }

}
