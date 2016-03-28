package ua.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ua.stqa.pft.addressbook.model.ContactData;
import ua.stqa.pft.addressbook.tests.TestBase;


public class ContactDeletionTests extends TestBase {

    @Test
    public void TestContactDeletion() {
        app.getNavigationHelper().goToHomePage();
        if(!app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("first name test ", "last name test",
                    "address test", "1111111", "2222222", "3333333", null,
                    "emailtest1@test.com", "emailtest2@test.com", "emailtest3@test.com", "test1"));
        }
        app.getContactHelper().selectFirstContact();
        app.getContactHelper().deleteContactBtn();
        app.getContactHelper().acceptContactDeletion();
        app.getNavigationHelper().goToHomePage();
    }
}
