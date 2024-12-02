package com.theelitelions20.HurricanePredictor.controller;


import com.theelitelions20.HurricanePredictor.model.user.User;
import com.theelitelions20.HurricanePredictor.model.user.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/user/get-all")
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    @PostMapping("/user/save")
    public User save(@RequestBody User user){
        return userDao.save(user);
    }

    @DeleteMapping("/user/delete/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable int id){
        boolean isDeleted = userDao.deleteUserById(id);
        if(isDeleted){
            return ResponseEntity.noContent().build(); //204 No Content
        }
        else{
            return ResponseEntity.notFound().build(); //404 Not Found
        }
    }

    @PutMapping("/user/update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User updatedUser){
        User user = userDao.updateUser(id, updatedUser);
        if(user != null){
            return ResponseEntity.ok(user); // 200 Ok
        }
        else{
            return ResponseEntity.notFound().build(); //404 Not Found
        }
    }
}
