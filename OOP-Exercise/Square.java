/**
 * Square --- program that stores data and models a square.
 * @author    Preston Garcia
 * @date      02/17/2021
 */
public class Square{ // Square class

   private double sideLength;
   
   /**
     * Sets the attribute of sideLength
     * to the passed in argument for the
     * creation of the Square object.
     * @param side The sideLength of the square.
     */
   public Square(double side){ // Square constructor
   
      this.sideLength = side;
   
   } // Square constructor
   
   /**
     * Gets the current value of the attribute
     * sideLength.
     * @return this.sideLength The current value
     * of the object's sideLength.
     */
   public double getSide(){ // getSide method
   
      return this.sideLength;
   
   } // getSide method
   
   /**
     * Calculates the area of the square using
     * the current value of sideLength.
     * @return area The area of the square.
     */
   public double getArea(){ // getArea method
   
      double area = this.sideLength * this.sideLength; // A = s^2
      return area;
   
   } // getArea method
   
   /**
     * Calculates the perimeter of the square
     * using the current value of sideLength.
     * @return perimeter The perimeter of the square.
     */ 
   public double getPerimeter(){ // getPerimeter method
   
      double perimeter = 4 * this.sideLength; // P = 4s
      return perimeter;
   
   } // getPerimeter method

} // Square class