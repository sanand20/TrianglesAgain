public class Triangle {
  Point v1;
  Point v2;
  Point v3;
  public Triangle(Point a, Point b, Point c) {
  v1 = a;
  v2 = b;
  v3 = c;
  }
  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
    v1 = new Point (x1, y1);
    v2 = new Point (x2, y2);
    v3 = new Point (x3, y3);
  }
  public double getPerimeter() {
    return v1.distanceTo(v2) + v2.distanceTo(v3) + v1.distanceTo(v3);
    }
  public double getArea() {
      double s = .5 * getPerimeter();
      return Math.sqrt (s * (s-v1.distanceTo(v2))* (s-v1.distanceTo(v3))* (s-v2.distanceTo(v3)));
    }
  public String classify() {
    double a = Math.round(v1.distanceTo(v2)*10000)/10000;
    double b = Math.round(v2.distanceTo(v3)*10000)/10000;
    double c = Math.round(v1.distanceTo(v3)*10000)/10000;
    if (a==b && b==c){
      return "equilateral";
    }
    else if (a==b || a==c || b==c ){
      return "isosceles";
    }
    else {return "scalene";}
  }
  
}
