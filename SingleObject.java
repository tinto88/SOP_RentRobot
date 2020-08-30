// import javax.print.DocFlavor.STRING;

// import java.util.ArrayList; // import the ArrayList class
public class SingleObject implements Cloneable {
   double random = Math.random() * 49 + 1;
   public double number = random;
   public String color = "red";
   public static SingleObject instance = new SingleObject();

   private SingleObject() {
      // this.color = c;
   }

   public Object clone() throws CloneNotSupportedException {
      return super.clone();
   }

   // Get the only object available
   public static SingleObject getInstance() {
      return instance;
   }

   public void showMessage() {
      System.out.println("Hello World!");
   }

   public void setColor(String c) {
      color = c;
   }

   public String getColor() {
      return color;
   }

   public boolean isColorEqual(String c) {
      if (color == c){
         return true;
      } else {
         return false;
      }
      
      
   }

}