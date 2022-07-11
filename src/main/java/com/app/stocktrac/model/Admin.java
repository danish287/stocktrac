package com.app.stocktrac.model;

public class Admin extends User {

    public Admin(String UID, String userType, String firstName, String lastName, String email, String password, String securityQuestion){
        this.userType = "Admin";
        this.UID = UID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.securityQuestion = securityQuestion;
    }

    @Override
    public void setUserType(String userType) {
        this.userType = "Admin";
    }
}
