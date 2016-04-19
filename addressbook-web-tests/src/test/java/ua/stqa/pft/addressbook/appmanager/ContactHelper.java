package ua.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ua.stqa.pft.addressbook.model.ContactData;

/**
 * Created by mareev on 11.03.2016.
 */
public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

   public void submitNewContactCreationBtn() {

     click(By.name("submit"));
  }

  public void fillNewContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getFirstName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getPhoneHome());
    type(By.name("mobile"), contactData.getPhoneMobile());
    type(By.name("work"), contactData.getPhoneWork());
    type(By.name("fax"), contactData.getFax());
    type(By.name("email"), contactData.getEmail1());
    type(By.name("email2"), contactData.getEmail2());
    type(By.name("email3"), contactData.getEmail3());

    if(creation){
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else{
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }

  public void addNewContactBtn() {
    click(By.linkText("add new"));
  }

  public void selectContact(int index) {
    wd.findElements(By.name("selected[]")).get(index).click();
  }

  public void deleteContactBtn() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void acceptContactDeletion() {
    acceptPrompt();
  }

  public void editContactBtn(int index) {
    wd.findElements(By.cssSelector("img[title='Edit']")).get(index).click();

  }

  public void submitContactModification() {
    click(By.xpath(".//input[@value='Update']"));
  }

  public void returnToHomePage() {
    click(By.linkText("home"));
  }

  public void createContact(ContactData contact) {
    addNewContactBtn();
    fillNewContactForm(contact, true);
    submitNewContactCreationBtn();
    returnToHomePage();
  }


  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getContactCount() {
    return wd.findElements(By.name("selected[]")).size();
  }
}
