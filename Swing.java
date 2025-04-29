import javax.swing.*;
public class Button {
   public static void main(String args[])
   {
      JFrame f= new JFrame("Button Example ");
      JButton b= new JButton("Click me");
      b.setBounds(40,100,90,50);
      f.add(b);
      f.setSize(400,400);
      f.setLayout(null);
      f.setVisible(true);
  }
}
