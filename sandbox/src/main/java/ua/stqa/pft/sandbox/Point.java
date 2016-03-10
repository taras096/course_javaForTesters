package ua.stqa.pft.sandbox;

/**
 * Created by mareev on 23.02.2016.
 */
public class Point {

  public double x;
  public double y;

  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }

//
//  public double distance(Point p1, Point p2){
//
//    return  Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
//
//  }

  public double distance (Point p2) {

    return  Math.sqrt(Math.pow((p2.x - this.x), 2) + Math.pow((p2.y - this.y), 2));

  }

}

