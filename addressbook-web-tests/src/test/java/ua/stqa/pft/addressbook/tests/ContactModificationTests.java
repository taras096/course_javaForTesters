package ua.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ua.stqa.pft.addressbook.model.ContactData;

/**
 * Created by mareev on 17.03.2016.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){
    app.getNavigationHelper().navigateToHomePage();
    app.getContactHelper().editFirstContactBtn();
    app.getContactHelper().fillNewContactForm(new ContactData("first name test ", "last name test",
            "address test", "1111111", "2222222", "3333333", "4444444",
            "emailtest1@test.com", "emailtest2@test.com", "emailtest3@test.com"));
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().navigateToHomePage();
  }
}
