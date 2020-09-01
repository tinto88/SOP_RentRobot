import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;

public class SingletonPatternDemo {

   public static void main(final String[] args) throws CloneNotSupportedException {

      final ArrayList<Object> robots = new ArrayList<Object>(); // Create an Robot ArrayList object

      final SingleObject robot_prototype = SingleObject.getInstance();
      
      while (true) {

         System.out.println("====================");
         final Scanner color = new Scanner(System.in); // Create a Scanner object
         System.out.println("--> Please Enter Robot Color");
         final String rColor = color.nextLine();
         System.out.println("==========");

         boolean isNew = true;
         int rIndex = 0;

         for (int i = 0; i < robots.size(); i++) {
            if (((((SingleObject) robots.get(i)).getColor()).equals(rColor))) {
               isNew = false;
               rIndex = i + 1;
            }
         }

         if (isNew) {
            if (robots.size() < 5) {
               System.out.print("--> ");

               // clone robot from prototype
               robots.add(robot_prototype.clone());

               // set color last robot
               ((SingleObject) robots.get(robots.size() - 1)).setColor(rColor);

               rIndex = robots.size();

               System.out.print(rColor);
               System.out.println(" are not in our list.");
               System.out.print("--> Create ");
               System.out.print(rColor);
               System.out.println(" success.");
            } else {
               System.out.println(" fail. -> robot is full");
               rIndex = 0;
            }
         } else {
            System.out.print("--> Wowza! we have ");
            System.out.print(rColor);
            System.out.println(" already in the list.");
         }

         System.out.println(">>>>>>>>>>>>>");
         System.out.print("Robot Size = ");
         System.out.println(robots.size());

         for (int i = 0; i < robots.size(); i++) {
            System.out.print("Robot ");
            System.out.print(i + 1);
            System.out.print(": ");
            System.out.print(robots.get(i));
            System.out.print(" color is ");
            System.out.println(((SingleObject) robots.get(i)).getColor());
         }
         System.out.println(">>>>>>>>>>>>>");
         System.out.print("HERE YOUR ROBOT NUMBER: ");
         System.out.println(rIndex);

         System.out.print("END PROGRAM (Y/N) : ");
         final Scanner input = new Scanner(System.in);
         String confirm = input.nextLine().toUpperCase();
         if (confirm.equals("Y") || confirm.equals("YES")) {
            break;
         }

         System.out.println("------------------------");
      }
   }
}
