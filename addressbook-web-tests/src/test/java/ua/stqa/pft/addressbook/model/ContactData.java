package ua.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstName;
  private final String lastName;
  private final String address;
  private final String phoneHome;
  private final String phoneMobile;
  private final String phoneWork;
  private final String fax;
  private final String email1;
  private final String email2;
  private final String email3;
  private final String group;

  public ContactData(String firstName, String lastName,
                     String address, String phoneHome, String phoneMobile,
                     String phoneWork, String fax, String email1,
                     String email2, String email3, String group) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phoneHome = phoneHome;
    this.phoneMobile = phoneMobile;
    this.phoneWork = phoneWork;
    this.fax = fax;
    this.email1 = email1;
    this.email2 = email2;
    this.email3 = email3;
    this.group = group;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getAddress() {
    return address;
  }

  public String getPhoneHome() {
    return phoneHome;
  }

  public String getPhoneMobile() {
    return phoneMobile;
  }

  public String getPhoneWork() {
    return phoneWork;
  }

  public String getFax() {
    return fax;
  }

  public String getEmail1() {
    return email1;
  }

  public String getEmail2() {
    return email2;
  }

  public String getEmail3() {
    return email3;
  }

  public String getGroup() {
    return group;
  }
}
