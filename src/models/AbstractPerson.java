package models;

public abstract class AbstractPerson {
  protected String firstName;
  protected String lastName;

  public AbstractPerson(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  protected abstract void speak();

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
