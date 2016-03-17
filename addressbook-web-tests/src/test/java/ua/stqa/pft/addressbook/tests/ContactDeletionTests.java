package ua.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ua.stqa.pft.addressbook.tests.TestBase;


public class ContactDeletionTests extends TestBase {

    @Test
    public void TestContactDeletion() {
        app.getNavigationHelper().navigateToHomePage();
        app.getContactHelper().selectFirstContact();
        app.getContactHelper().deleteContactBtn();
        app.getContactHelper().acceptContactDeletion();
        app.getNavigationHelper().navigateToHomePage();
    }
}
