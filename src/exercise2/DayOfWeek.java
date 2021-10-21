package exercise2;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day of week: ");
        int number = input.nextInt();

        if (number == 1) {
          System.out.println("Day of the week: Monday");
        } else if (number == 2) {
          System.out.println("Day of the week: Tuesday");
        } else if (number == 3) {
          System.out.println("Day of the week: Wednesday");
        } else if (number == 4) {
          System.out.println("Day of the week: Thursday");
        } else if (number == 5) {
          System.out.println("Day of the week: Friday");
        } else if (number == 6) {
          System.out.println("Day of the week: Sathurday");
        } else if (number == 7) {
          System.out.println("Day of the week: Sunday");
        } else { 
          System.out.println("Invalid day");
        }  
      input.close();
    }

}