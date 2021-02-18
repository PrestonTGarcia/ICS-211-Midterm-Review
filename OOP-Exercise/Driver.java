/**
 * Driver --- program to test Square and Cube.
 * @author    Preston Garcia
 * @date      02/17/2021
 */
public class Driver{ // Driver class

   /**
     * Tests the methods from Square.java
     * and Cube.java and prints the values
     * that the methods return to confirm
     * that it's working as intended.
     * @param args A string array containing 
     * the command line arguments.
     */
   public static void main(String[] args){ // main method
   
      // Constructor tests
      Square s = new Square(4);
      Cube c = new Cube(2);
      
      // Square method tests
      System.out.println("Side: " + s.getSide());
      System.out.println("Area: " + s.getArea());
      System.out.println("Perimeter: " + s.getPerimeter() + "\n");
      
      // Cube method tests
      System.out.println("Side: " + c.getSide());
      System.out.println("Area: " + c.getArea());
      System.out.println("Perimeter: " + c.getPerimeter());
   
   } // main method

} // Driver class