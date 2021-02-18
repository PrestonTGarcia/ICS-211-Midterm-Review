public class Square{ // Square class

   private double sideLength;

   public Square(double side){ // Square constructor
   
      this.sideLength = side;
   
   } // Square constructor
   
   public double getSide(){ // getSide method
   
      return this.sideLength;
   
   } // getSide method
   
   public double getArea(){ // getArea method
   
      double area = this.sideLength * this.sideLength; // A = s^2
      return area;
   
   } // getArea method
   
   public double getPerimeter(){ // getPerimeter method
   
      double perimeter = 4 * this.sideLength; // P = 4s
      return perimeter;
   
   } // getPerimeter method

} // Square class