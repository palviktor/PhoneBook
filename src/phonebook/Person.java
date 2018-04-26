
package phonebook;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author vikk
 */
public class Person {
  private final SimpleStringProperty lastName;
  private final SimpleStringProperty firstName;
  private final SimpleStringProperty email;

  public Person(){
    this.firstName = new SimpleStringProperty("");
    this.lastName = new SimpleStringProperty("");
    this.email = new SimpleStringProperty("");
  }
  
  public Person(String fNmame, String lNmame, String email){
    this.firstName = new SimpleStringProperty(fNmame);
    this.lastName = new SimpleStringProperty(lNmame);
    this.email = new SimpleStringProperty(email);
  }
  
  public String getLastName() {
    return lastName.get();
  }

  public void setLastName(String lastName) {
    this.lastName.set(lastName);
  }

  public String getFirstName() {
    return firstName.get();
  }

  public void setFirstName(String firstName) {
    this.firstName.set(firstName);
  }
  
  public String getEmail() {
    return email.get();
  }
  
  public void serEmail(String email) {
    this.email.set(email);
  }
}
