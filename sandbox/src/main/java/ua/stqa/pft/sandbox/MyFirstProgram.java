package ua.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {


    Point point1 = new Point(3, 4);
    Point point2 = new Point(7, 8);

    System.out.println("Расстояние между точками равно " + point1.distance(point1, point2));

  }

}