package model;

import java.util.Date;

public class Parent {
    public int id;
    public String firstName;
    public String lastName;
    public boolean wooman;
    public Date dataOfBirth;
    public String city;
    public String streetAndNumber;
    public int postCode;
    public String loginName;
    public String password;

    public Parent(int id, String firstName, String lastName, boolean wooman, Date dataOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.wooman = wooman;
        this.dataOfBirth = dataOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isWooman() {
        return wooman;
    }

    public Date getDataOfBirth() {
        return dataOfBirth;
    }

    public String getCity() {
        return city;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public int getPostCode() {
        return postCode;
    }

    public String getLoginName() {
        return loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWooman(boolean wooman) {
        this.wooman = wooman;
    }

    public void setDataOfBirth(Date dataOfBirth) {
        this.dataOfBirth = dataOfBirth;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

