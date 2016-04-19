package ua.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ua.stqa.pft.addressbook.model.ContactData;

/**
 * Created by mareev on 17.03.2016.
 */
public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification(){
    app.getNavigationHelper().goToHomePage();
    if(!app.getContactHelper().isThereAContact()){
      app.getContactHelper().createContact(new ContactData("first name test ", "last name test",
              "address test", "1111111", "2222222", "3333333", null,
              "emailtest1@test.com", "emailtest2@test.com", "emailtest3@test.com", "test1"));
    }
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().editContactBtn(before - 1);
    app.getContactHelper().fillNewContactForm(new ContactData("first name test ", "last name test",
            "address test", "1111111", "2222222", "3333333", "4444444",
            "emailtest1@test.com", "emailtest2@test.com", "emailtest3@test.com", null), false);
    app.getContactHelper().submitContactModification();
    app.getNavigationHelper().goToHomePage();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after, before);
  }
}
