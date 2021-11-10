package ch.makery.address.model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
public class Person {

    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty street;
    private final IntegerProperty postalCode;
    private final StringProperty city;
    private final ObjectProperty<LocalDate> birthday;

    public Person () {
        this(null, null);

    }

    public Person(String firsName, String lastName) {
        this.firstName = new SimpleStringProperty(firsName);
        this.lastName = new SimpleStringProperty(lastName);
        this.street = new SimpleStringProperty("какая-то улица");
        this.postalCode = new SimpleIntegerProperty(1234);
        this.city = new SimpleStringProperty("город");
        this.birthday = new SimpleObjectProperty<LocalDate>(LocalDate.of(1999, 2, 21));
    }

    public String getFirstName() {
        return firstName.get();

    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName () {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty () {
        return lastName;
    }

    public StringProperty streetProperty () {
        return street;
    }

    public int getPostalCode () {
        return postalCode.get();
    }

    public void setPostalCode (int postalCode) {
        this.postalCode.set(postalCode);
    }

    public  IntegerProperty postalCodeProperty () {
        return postalCode;
    }

    public String geteCity () {
        return city.get();
    }

    public void setCity (String city) {
        this.city.set(city);
    }

    public StringProperty cityProperty () {
        return city;
    }

    public LocalDate getBirthday(){
        return birthday.get();
    }

    public  void setBirthday (LocalDate birthday) {
        this.birthday.set(birthday);
    }

    public ObjectProperty<LocalDate> birthdayProperty () {
        return birthday;
    }

 }
