package ua.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by mareev on 10.03.2016.
 */
public class NavigationHelper extends HelperBase{

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void goToGroupPage() {
    click(By.linkText("groups"));
  }
}
