package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import data.BoxGameDAO;
import data.User;


@RestController
public class BoxGameController {

    @Autowired
    BoxGameDAO dao;
    
    @RequestMapping("scores")
    public List<User> getAllUser(){
        List<User> allUsers = dao.getAllUsers();
        
        return allUsers;
    }
    
    
    @RequestMapping(value= "scores", method= RequestMethod.POST)
    public void addScore(@RequestBody User user) {
        System.out.println("in add resort");
        //User u = new User(user.getName(), user.getScore());
        dao.addScore(user);
    }

}
