package com.management.usermanagementsystem.controller;

import com.management.usermanagementsystem.model.Usermanagementmodel;
import com.management.usermanagementsystem.service.Usermanagementservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Usermanagementcontroller {
    public Usermanagementservice usermanagementservice;

    public Usermanagementcontroller(Usermanagementservice usermanagementservice) {
        this.usermanagementservice = usermanagementservice;
    }
    //http://localhost:8080/getuser/1
    @GetMapping("/getuser/{userid}")
    public String getUser(@PathVariable int userid){
    return usermanagementservice.findByID(userid);
    }
    //http://localhost:8080/getalluser
    @GetMapping("/getalluser")
    public List<Usermanagementmodel> getAllUser(){

        return usermanagementservice.findAll();
    }

    @PostMapping("/adduser")
    public String addUser(@RequestParam int userid, String name, String username, String address, int phone){
        return usermanagementservice.addUser(userid,name,username,address,phone);
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        return usermanagementservice.delete(id);
    }
    @PutMapping("/update")
    public String update(@RequestParam int id,String name, String username, String address, int phonenumber){

            return usermanagementservice.update(id,name,username,address,phonenumber);



    }

}
