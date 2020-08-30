import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;

public class SingletonPatternDemo {

   public static void main(final String[] args) throws CloneNotSupportedException {

      final ArrayList<Object> robots = new ArrayList<Object>(); // Create an Robot ArrayList object

      final SingleObject robot_prototype = SingleObject.getInstance();
      robot_prototype.setColor("blue"); // set color

      char confirm = 'y';
      while (confirm == 'y') {
         System.out.println("====================");
         final Scanner color = new Scanner(System.in); // Create a Scanner object
         System.out.println("--> Please Enter Robot Color");
         final String rColor = color.nextLine();
         System.out.println("==========");
         int isNew = 1;
         int rIndex = robots.size();
         for (int i = 0; i < robots.size(); i++) {
            if (robots.get(i).equals(rColor)) {
               isNew = 0;
               rIndex = i;
            }
         }
         if (isNew == 1) {
            System.out.print("--> ");
            robots.add(rColor);
            System.out.print(rColor);
            System.out.println(" are not in our list.");
            System.out.print("--> Create ");
            System.out.print(rColor);
            System.out.println(" success.");
         }else{
            System.out.print("--> Wowza! we have ");
            System.out.print(rColor);
            System.out.println(" already in the list.");
         }
         System.out.println("==========");
         System.out.print("Robot Size = ");
         System.out.println(robots.size());
         for (int i = 0; i < robots.size(); i++) {
            System.out.print("Robot ");
            System.out.print(i);
            System.out.print(": ");
            System.out.println(robots.get(i));
         }
         System.out.println("==========");
         System.out.print("HERE YOUR ROBOT NUMBER: ");
         System.out.println(rIndex);
         System.out.println("====================");
      }
   }
}
