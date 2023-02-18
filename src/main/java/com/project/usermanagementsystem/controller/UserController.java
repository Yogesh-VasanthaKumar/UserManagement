package com.project.usermanagementsystem.controller;

import com.project.usermanagementsystem.dao.UserRepository;
import com.project.usermanagementsystem.dto.UserRequest;
import com.project.usermanagementsystem.model.User;
import jakarta.validation.Valid;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.project.usermanagementsystem.service.userService;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    public userService userservice;
    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest){
        return new ResponseEntity<>(userservice.saveUser(userRequest),HttpStatus.CREATED);
    }

    @GetMapping("/getusers")
    public  ResponseEntity<List<User>> getAll(){
        return new ResponseEntity<>(userservice.getAllUsers(), HttpStatus.OK);
    }

    @GetMapping("/getuser/{id}")
    public ResponseEntity<User> getUser(@PathVariable int id){
        return new ResponseEntity<>(userservice.getUser(id),HttpStatus.OK);
    }

    @PutMapping("/update/{id}/{name}")
    public ResponseEntity<String> update(@PathVariable int id, String name){
        return new ResponseEntity<>(userservice.updateUser(id,name), HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id){
        return new ResponseEntity<>(userservice.deleteUser(id),HttpStatus.OK);
    }
}
