package com.tyss.JWT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private UserService userService;
    @GetMapping("/test")
    public List<User> getUsers(){
        System.out.println("getting users");
        return userService.getUsers();
    }
}
