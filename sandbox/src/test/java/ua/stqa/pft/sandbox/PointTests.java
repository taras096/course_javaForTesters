package ua.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by mareev on 09.03.2016.
 */
public class PointTests {

  @Test
  public void testDistanceCorrectOne(){

    Point p11 = new Point(3, 4);
    Point p22 = new Point(7, 8);
    Assert.assertEquals(p11.distance(p11, p22), 5.656854249492381);

  }

  @Test
  public void testDistanceCorrectTwo(){

    Point p11 = new Point(3, 4);
    Point p22 = new Point(5, 6);
    Assert.assertEquals(p11.distance(p11, p22), 2.8284271247461903);

  }

  @Test
  public void testDistanceFalse(){

    Point p11 = new Point(3, 4);
    Point p22 = new Point(5, 6);
    Assert.assertEquals(p11.distance(p11, p22), 22.0);

  }

}
