package com.app.stocktrac.service;
import java.util.UUID;

import com.app.stocktrac.model.Admin;
import com.app.stocktrac.model.Regular;

public class UserService {

    public static Admin addAdmin(){
        Admin admin = new Admin(UUID.randomUUID().toString(), "Admin", "Dania", "Estrada", "ale.@gmail.com", "pw", "securityQuestion");
        return admin;
    }

    public static Regular addReg(){
        Regular reg = new Regular(UUID.randomUUID().toString(), "Admin", "Dania", "Estrada", "ale.@gmail.com", "pw", "securityQuestion");
        return reg;
    }
    
}
