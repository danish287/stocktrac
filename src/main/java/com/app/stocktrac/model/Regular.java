package com.app.stocktrac.model;

public class Regular extends User{

    public Regular(String UID, String userType, String firstName, String lastName, String email, String password, String securityQuestion){
        this.userType = "Regular";
        this.UID = UID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.securityQuestion = securityQuestion;
    }

    @Override
    public void setUserType(String userType) {
        this.userType = "Regular";
    }
    
}
