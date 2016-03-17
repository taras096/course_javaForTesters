package ua.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ua.stqa.pft.addressbook.model.ContactData;

/**
 * Created by mareev on 11.03.2016.
 */
public class ContactHelper extends HelperBase{

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

   public void submitNewContactCreationBtn() {

     click(By.name("submit"));
  }

  public void fillNewContactForm(ContactData contactData) {
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
  }

  public void addNewContactBtn() {
    click(By.linkText("add new"));
  }

  public void selectFirstContact() {
    click(By.xpath("//tr[2]//*[@name='selected[]']"));
  }

  public void deleteContactBtn() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
  }

  public void acceptContactDeletion() {
    acceptPrompt();
  }

  public void editFirstContactBtn() {
    click(By.xpath(".//*[@id='maintable']//tr[2]/td[8]/a"));
  }

  public void submitContactModification() {
    click(By.xpath(".//input[@value='Update']"));
  }
}
