package ua.stqa.pft.sandbox;

public class MyFirstProgram{
	
	public static void main(String[] args){



    Point point1 = new Point(3, 4);
    Point point2 = new Point(7, 8);

    System.out.println("Расстояние между точками равно " + distance(point1, point2));

  }

  public static double distance(Point p1, Point p2){

    return  Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));

  }

}                         