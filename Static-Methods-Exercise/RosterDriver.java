import java.util.Scanner;

/**
 * RosterDriver --- Prints a menu and tests the Roster.java program.
 * @author          Preston Garcia
 * @date            02/18/2021
 */
public class RosterDriver{ // RosterDriver class

   /**
     * Prints the menu and asks user to
     * input a number for a command.
     * @param arg A string array containing 
     * the command line arguments.
     */   
   public static void main(String[] args){ // main method
   
      Scanner sc = new Scanner(System.in);
      int userChoice = 4;
      String inputtedEmployee;
      int removedNum;
      
      while (userChoice != 0){ // while loop running until user enters 0
      
         System.out.println("0. Exit");
         System.out.println("1. Add Employee");
         System.out.println("2. Remove Employee");
         System.out.println("3. Print all Employees");
         userChoice = sc.nextInt();
         sc = new Scanner(System.in);
         
         if (userChoice == 1){ // Add choice
         
            System.out.println("What is the employees name?");
            inputtedEmployee = sc.nextLine();
            sc = new Scanner(System.in);
            Roster.addEmployee(inputtedEmployee);
         
         } // Add choice
         
         if (userChoice == 2){ // Remove choice
         
            System.out.println("What number employee do you want to remove?");
            removedNum = sc.nextInt();
            sc = new Scanner(System.in);
            Roster.removeEmployee(removedNum);
         
         } // Remove choice
         
         if (userChoice == 3){ // Print all choice
         
            System.out.println("Here is all the employees:");
            Roster.printEmployees();
         
         } // Print all choice
      
      } // while loop running until user enters 0
   
   } // main method

} // RosterDriver class