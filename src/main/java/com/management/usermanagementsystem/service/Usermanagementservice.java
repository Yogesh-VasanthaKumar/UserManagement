package com.management.usermanagementsystem.service;

import com.management.usermanagementsystem.model.Usermanagementmodel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Usermanagementservice {
    public static List<Usermanagementmodel> userlist = new ArrayList<Usermanagementmodel>();
    static int count=0;
    static {
        userlist.add(new Usermanagementmodel(1,"Yogesh","yogesh","address",806));
    }

    public List<Usermanagementmodel> findAll(){
        return userlist;
    }

    public String findByID(int userid){

       for (Usermanagementmodel user:userlist) {
           if (user.getUserID() == userid) {
               return user.toString();
           }
       }
       count++;

       return "User not found"+count;

    }

    public String addUser(int userid, String name, String username, String address, int phone){
        userlist.add(new Usermanagementmodel(userid,name,username,address,phone));
        return "Added";
    }
    public String delete(int id){
        if(userlist.size()==0){
            return "Database Empty";
        }
        for (Usermanagementmodel user:userlist) {
            if(user.getUserID()==id){
                userlist.remove(user);
                return "deleted";
            }
        }
        return "id not found";

    }
public String update(int userid, String name, String username, String address, int phone){
    if(userlist.size()==0){
        return "Database Empty";
    }
    for (Usermanagementmodel user:userlist) {
        if(user.getUserID()==userid){
            user.setUserName(username);
            user.setAddress(address);
            user.setName(name);
            user.setPhonenumber(phone);
            return "User updated";
        }
    }
    return "User Not Found";
}
}
