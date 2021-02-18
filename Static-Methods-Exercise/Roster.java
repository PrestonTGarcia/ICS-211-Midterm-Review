import java.util.ArrayList;

/**
 * Roster --- program that holds all the data for a roster of names
 * @author    Preston Garcia
 * @date      02/18/2021
 */
public class Roster{ // Roster class

   public static ArrayList<String> RosterList = new ArrayList<String>(0);
   
   /**
     * Adds the name specified to the
     * RosterList.
     * @param name The name to be added.
     */
   public static void addEmployee(String name){ // addEmployee method
   
      RosterList.add(name);
      System.out.println(name + " was added!");    
   
   } // addEmployee method
   
   /**
     * Removes the num employee specified
     * from the RosterList. The parameter
     * num should be the index + 1.
     * @param num The number of employee
     * to remove.
     */
   public static void removeEmployee(int num){ // removeEmployee method
   
      String name = RosterList.remove(num - 1); // minus 1 here because I wanted to make it more user friendly by starting at 1.
      System.out.println("Employee #" + num + " named " + name + " was removed.");
   
   } // removeEmployee method
   
   /**
     * Prints all the employees in a numbered
     * list.
     */
   public static void printEmployees(){ // printEmployees method
   
      int numberEmployee = 1;
      for (String employee : RosterList){ // for loop iterating through employees
      
         System.out.println(numberEmployee + ". " + employee);
         numberEmployee++;
      
      } // for loop iterating through employees
      
      System.out.println();
   
   } // printEmployees method

} // Roster class