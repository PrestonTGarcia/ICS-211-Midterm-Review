public class Cube extends Square{ // Cube class

   public Cube(double side){ // Cube constructor
   
      super(side); // Calls on Square constructor method
   
   } // Cube constructor
   
   @Override
   public double getArea(){ // getArea method
   
      double area = 6 * super.getArea(); // A square = s^2, A cube = 6s^2 = 6 * A square
      return area;
   
   } // getArea method
   
   @Override
   public double getPerimeter(){ // getPerimeter method
   
      double perimeter = 3 * super.getPerimeter(); // P square = 4s, P cube = 12s, P cube = 3 * 4s = 3 * P square
      return perimeter;
   
   } // getPerimeter

} // Cube class