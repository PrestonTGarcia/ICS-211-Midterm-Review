/**
 * CoordsTest --- program that tests Coordinates.java
 * @author        Preston Garcia
 * @date          02/18/2021
 */
public class CoordsTest{ // CoordsTest class

   /**
     * Prints all the coordinates in the given dataset
     * in (x, y) form.
     * @param arg A string array containing the command 
     * line arguments.
     */
   public static void main(String[] args){ // main method
   
      double[][] dataSet = {{4, 5, 6, 7}, {16, 25, 36, 49}};
      Coordinates coords = new Coordinates(dataSet);
      coords.printPoints();
   
   } // main method

} // CoordsTest class