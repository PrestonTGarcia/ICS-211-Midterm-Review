/**
 * Cube --- program that stores data and models a cube.
 * @author  Preston Garcia
 * @date    02/17/2021
 */
public class Cube extends Square{ // Cube class

   /**
     * Sets the attribute size 
     * inherited from the Square 
     * class to the argument passed
     * in through this new constructor.
     * @param side The side length of the
     * cube. 
     */
   public Cube(double side){ // Cube constructor
   
      super(side); // Calls on Square constructor method
   
   } // Cube constructor
   
   /**
     * Overridden method from the Square
     * class. Uses polymorphism to caluclate
     * the area of the cube rather than the 
     * square.
     * @return area The area of the cube.
     */
   @Override
   public double getArea(){ // getArea method
   
      double area = 6 * super.getArea(); // A square = s^2, A cube = 6s^2 = 6 * A square
      return area;
   
   } // getArea method
   
   /**
     * Overridden method from the Square
     * class. Uses polymorphism to calculate
     * the perimeter of the cube rather than
     * the square.
     * @return perimeter The perimeter of the cube.
     */
   @Override
   public double getPerimeter(){ // getPerimeter method
   
      double perimeter = 3 * super.getPerimeter(); // P square = 4s, P cube = 12s, P cube = 3 * 4s = 3 * P square
      return perimeter;
   
   } // getPerimeter

} // Cube class