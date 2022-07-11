package com.app.stocktrac.controller;
// import java.util.UUID;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.stocktrac.model.Admin;
import com.app.stocktrac.model.Regular;
import com.app.stocktrac.service.UserService;

@RestController
public class UserController {

    @GetMapping("/helloworld")
    public String Hello(){
        return "Hello world";
    }

    @GetMapping("/admin")
    public Admin admin(){
        Admin temp = UserService.addAdmin();
        return temp;
    }

    @GetMapping("/reg")
    public Regular reg(){
        Regular temp = UserService.addReg();
        return temp;
    }
    
}
