public class Circle2D{

/*
(Geometry: the Circle2D class) Define the Circle2D class that contains:
 Two double data fields named x and y that specify the center of the circle
with getter methods.
 A data field radius with a getter method.
 A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
for radius.
 A constructor that creates a circle with the specified x, y, and radius.
A method getArea() that returns the area of the circle.
 A method getPerimeter() that returns the perimeter of the circle.
 A method contains(double x, double y) that returns true if the
specified point (x, y) is inside this circle (see Figure 10.21a).
 A method contains(Circle2D circle) that returns true if the specified
circle is inside this circle (see Figure 10.21b).
 A method overlaps(Circle2D circle) that returns true if the specified
circle overlaps with this circle (see Figure 10.21c).
*/

   private double x;
   private double y;
   private double radius;
   
   public Circle2D(double x, double y, double radius){
      this.x = x;
      this.y = y;
      this.radius = radius;
   }
   public Circle2D(){
      this(0,0,1);
   }
   public double getX(){
      return x;}
   
   public double getY(){
      return y;}
   
   public double getRadius(){
      return radius;}
   
   public double getArea(){
      return Math.PI*radius*radius;
   }
   
   public double getPerimeter(){
      return 2*radius*Math.PI;
   }
   
   public double dis(double x, double y){
      double d1 = this.x - x; double d2 = this.y-y;
      return Math.sqrt(d1*d1+d2*d2);
   }
   
   public boolean contains(double x, double y){
      boolean res = true;
      
      if(dis(x,y) >= radius) res = false;
      
      return res;
   }
   
   public boolean contains(Circle2D circle){
      boolean res= true;
      
      if(dis(circle.x, circle.y)>= Math.abs(radius-circle.radius)) res = false;
      return res;
   }  
   
   public boolean overlaps(Circle2D circle){
      boolean res = false;
      
      if(dis(circle.x,circle.y)<=(radius+circle.radius)) res = true;
      
      return res;
      
   }
}