 interface Shape
 {
 double getArea();
 }
 class Rectangle implements Shape
 {
 private double length;
 private double width;
 public Rectangle(double length,double width) {
 this.length= length;
 this.width=width;

 }
 public double getArea()
 {
 return length * width;
 }
 
 }
 class Circle implements Shape
 {
 private double radius;
 public Circle(double radius)
 {
 this.radius=radius;
 }
 public double getArea()
 {
 return 3.14 * radius *radius;
 }


 }
 class Triangle implements Shape
 {
 private double base;
 private double hight;
 public Triangle(double base,double hight)
 {
 this.base=base;
 this.hight=hight;
 }
 public double getArea()
 {
 return 0.5 * base * hight;
 }
}
 public class Demo2 {
 public static void main(String[] args) {
 Rectangle R = new Rectangle(6,4);
 Circle C = new Circle(5);
 Triangle T = new Triangle(6,4);
 System.out.println("Area of triangle is : "+ T.getArea());
 System.out.println("Area of Circle is : "+ C.getArea());
 System.out.println("Area of Rectangle is : "+ R.getArea());
 }

 }
