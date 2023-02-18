package com.management.usermanagementsystem.controller;

import com.management.usermanagementsystem.dao.UserManagementRepository;
import com.management.usermanagementsystem.model.Usermanagementmodel;
import com.management.usermanagementsystem.service.Usermanagementservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Usermanagementcontroller {
    @Autowired
    UserManagementRepository userManagementRepository;


    //http://localhost:8080/getuser/1
//    @GetMapping("/getuser/{userid}")
//    public String getUser(@PathVariable int userid){
//        repository.findById(userid);
//    return "Found";
//    }
//    //http://localhost:8080/getalluser
//    @GetMapping("/getalluser")
//    public List<Usermanagementmodel> getAllUser(){
//
//        return repository.findAll();
//    }
//
//    @PostMapping("/adduser")
//    public String addUser(@RequestBody Usermanagementmodel user){
//        repository.save(user);
//        return "Employee Saved";
//    }
//    @DeleteMapping("/delete/{id}")
//    public String delete(@PathVariable int id){
//         repository.deleteById(id);
//         return "Deleted";
//    }
//    @PutMapping("/update")
//    public String update(@RequestBody Usermanagementmodel user){
//
//           repository.save(user);
//           return "Updated";



   }

}
