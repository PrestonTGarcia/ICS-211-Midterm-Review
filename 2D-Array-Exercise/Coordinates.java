import java.util.ArrayList;
/**
 * Coordinates --- Converts coordinates in a given dataset
                   from [[xPoints], [yPoints]] to [[x, y]] 
                   and stores the data.
 * @author         Preston Garcia
 * @date           02/18/2021
 */

public class Coordinates{ // Coordinates class

   private double coordsArr[][];
   
   /**
     * Takes in a set of data in the form
     * of [[xCoordinates], [yCoordinates]]
     * and sets the member variable coords
     * to [[x, y]].
     * @param data The original dataset in the form
     * [[xCoordinates], [yCoordinates]].
     */
   public Coordinates(double[][] data){ // Coordinates constructor
   
      coordsArr = new double[data[0].length][2]; // Rows is amount of points, columns is x and y
   
      for (int column = 0; column < data[0].length; column++){ // for loop iterating through x points
      
         coordsArr[column][0] = data[0][column]; // Sets x value
         coordsArr[column][1] = data[1][column]; // Sets y value
      
      } // for loop iterating through x points 
   
   } // Coordinates constructor
   
   /**
     * Prints each of the elements of coordsArr
     * as a point in the form (x, y).
     */
   public void printPoints(){ // printPoints method
   
      for (int row = 0; row < coordsArr.length; row++){ // for loop iterating through each point
      
         System.out.println("(" + coordsArr[row][0] + ", " + coordsArr[row][1] + ")");
      
      } // for loop iterating through each point
   
   } // printPoints method

} // Coordinates class