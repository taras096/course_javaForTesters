package ua.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ua.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().addNewContactBtn();
    app.getContactHelper().fillNewContactForm(new ContactData("first name test ", "last name test",
            "address test", "1111111", "2222222", "3333333", "4444444",
            "emailtest1@test.com", "emailtest2@test.com", "emailtest3@test.com"));
    app.getContactHelper().submitNewContactCreationBtn();
    app.getNavigationHelper().goToHomePage();
  }
}
