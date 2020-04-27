public class MyPoint{
/*
10.4 (The MyPoint class) Design a class named MyPoint to represent a point with
x- and y-coordinates. The class contains:
 The data fields x and y that represent the coordinates with getter
methods.
 A no-arg constructor that creates a point (0, 0).
 A constructor that constructs a point with specified coordinates.
 A method named distance that returns the distance from this point to a
specified point of the MyPoint type.
 A method named distance that returns the distance from this point to
another point with specified x- and y-coordinates.
*/
   private double x;
   private double y;
   
   public MyPoint(){
      x=0; y=0;
   }
   public MyPoint(double x, double y){
      this.x = x; this.y = y;
   }
   public double getX(){
      return x;
   }
   public double getY(){
      return y;
   }
   public double distance(MyPoint p){
      double d1 = p.x -this.x; double d2 = p.y - this.y;
      return Math.sqrt(d1*d1+d2*d2);
   }
   public double distance(double x, double y){
      double d1 = x -this.x; double d2 = y - this.y;
      return Math.sqrt(d1*d1+d2*d2);
   }
   
}