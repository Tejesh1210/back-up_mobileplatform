package April15thAssignments;
class Shape {

    public double area() {
      // This method can be overridden in subclasses to provide specific area calculation
      return 0;
    }
  }
  
  class Circle extends Shape {
  
    private double radius;
  
    public Circle(double radius) {
      this.radius = radius;
    }
  
    @Override
    public double area() {
      return Math.PI * radius * radius;
    }
  }
  
  class Rectangle extends Shape {
  
    private double length;
    private double width;
  
    public Rectangle(double length, double width) {
      this.length = length;
      this.width = width;
    }
  
    @Override
    public double area() {
      return length * width;
    }
  }
  
  public class ShapeMain {
  
    public static void main(String[] args) {
      Circle circle = new Circle(15);
      Rectangle rectangle = new Rectangle(24, 36);
  
      System.out.println(circle.area());
      System.out.println(rectangle.area());
    }
  }