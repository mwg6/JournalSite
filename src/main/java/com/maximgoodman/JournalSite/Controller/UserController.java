package com.maximgoodman.JournalSite.Controller;

import com.maximgoodman.JournalSite.Model.UserModel;
import com.maximgoodman.JournalSite.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping
    public List<UserModel> getAllUsers(){
        return userService.findAll();
    }

    @PostMapping
    public void addUser(@RequestBody UserModel payload){
        System.out.println(payload);
        userService.addUser(payload);
    }
}
