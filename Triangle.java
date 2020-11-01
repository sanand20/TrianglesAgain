public class Triangle {
  Point v1;
  Point v2;
  Point v3;
  public Triangle(Point a, Point b, Point c) {
  Point v1 = a;
  Point v2 = b;
  Point v3 = c;
  }
  public Triangle(double x1, double y1,double x2, double y2,double x3, double y3){
    Point v1 = Point (x1, y1);
    Point v2 = Point (x2, y2);
    Point v3 = Point (x3, y3);
  }
//  public double getPerimeter() {
  //  return v1.distanceTo(v2) + v2.distanceTo(v3) + v1.distanceTo(v3);
  //}
}
