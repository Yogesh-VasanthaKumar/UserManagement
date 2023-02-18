package com.project.usermanagementsystem.service;

import com.project.usermanagementsystem.dao.UserRepository;
import com.project.usermanagementsystem.dto.UserRequest;
import com.project.usermanagementsystem.model.User;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Date;
import java.util.List;
@Service
public class userService {
    @Autowired
    UserRepository repository;

    public User saveUser(UserRequest userRequest){
        User user =User.build(0,userRequest.getUserName(),userRequest.getDateOfBirth(),userRequest.getEmail(),userRequest.getPhoneNumber(),userRequest.getCurrentDT());
        return repository.save(user);
    }

    public List<User> getAllUsers(){
        return repository.findAll();
    }

    public User getUser(int id){
        return repository.findById(id);
    }

    public String  deleteUser(int id){

        repository.deleteById(id);
        return "deleted";
    }

    public String updateUser(int id, String name){
            List<User> users = repository.findAll();

            for(User user: users){
                if(user.getId()==id){
                    user.setUserName(name);
                }
                repository.save(user);
                return "updated";
            }
            return "Not Updated";    }


}
