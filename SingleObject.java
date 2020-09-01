public class SingleObject implements Cloneable {
   public String color;
   public static SingleObject instance = new SingleObject("blue");

   private SingleObject(String c) {
      this.color = c;
   }

   // Get the only object available
   public static SingleObject getInstance() {
      return instance;
   }

   public Object clone() throws CloneNotSupportedException {
      return super.clone();
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
      if (color == c) {
         return true;
      } else {
         return false;
      }
   }
}