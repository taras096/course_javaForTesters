package ua.stqa.pft.addressbook.tests;

import org.testng.Assert;
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
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().selectFirstContact();
        app.getContactHelper().deleteContactBtn();
        app.getContactHelper().acceptContactDeletion();
        app.getNavigationHelper().goToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before - 1);
    }
}
