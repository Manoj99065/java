class name {
   private String name;
   private int age;

   public name(String name, int age) {
      this.name = name;
      this.age = age;
   }

   String getname() {
      return name;
   }

   void setname(String name) {
      this.name = name;
   }

   int getage() {
      return age;
   }

   void setage(int age) {
      this.age = age;
   }
}

public class Encapsulation {
   public static void main(String args[]) {
      name obj = new name("manoj", 44);

      System.out.println("The name of the student is  =" + obj.getname());
      System.out.println("THe age of the student is = " + obj.getage());

      obj.setname("Thakur");
      obj.setage(30);

      System.out.println("THe output is = " + obj.getname());
      System.out.println("THe output is = " + obj.getage());
   }
}
