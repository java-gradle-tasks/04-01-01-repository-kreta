package model;

import java.util.Date;

public class Teacher {
    
        public long Id;
        public String FirstName;
        public String LastName;
        public boolean Wooman;
        public Date DataOfBirth;
        public String City;
        public String StreetAndNumber;
        public int PostCode;
        public String LoginName;
        public String Password;
        public int GrossSalary;
        public int NumberOfChildren;

    public Teacher(long id, String firstName, String lastName, boolean wooman, Date dataOfBirth) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        Wooman = wooman;
        DataOfBirth = dataOfBirth;
    }

    public long getId() {
        return Id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public boolean isWooman() {
        return Wooman;
    }

    public Date getDataOfBirth() {
        return DataOfBirth;
    }

    public String getCity() {
        return City;
    }

    public String getStreetAndNumber() {
        return StreetAndNumber;
    }

    public int getPostCode() {
        return PostCode;
    }

    public String getLoginName() {
        return LoginName;
    }

    public String getPassword() {
        return Password;
    }

    public int getGrossSalary() {
        return GrossSalary;
    }

    public int getNumberOfChildren() {
        return NumberOfChildren;
    }

    public void setId(long id) {
        Id = id;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setWooman(boolean wooman) {
        Wooman = wooman;
    }

    public void setDataOfBirth(Date dataOfBirth) {
        DataOfBirth = dataOfBirth;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        StreetAndNumber = streetAndNumber;
    }

    public void setPostCode(int postCode) {
        PostCode = postCode;
    }

    public void setLoginName(String loginName) {
        LoginName = loginName;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void setGrossSalary(int grossSalary) {
        GrossSalary = grossSalary;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        NumberOfChildren = numberOfChildren;
    }
}
