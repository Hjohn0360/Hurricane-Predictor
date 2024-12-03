package com.theelitelions20.HurricanePredictor.controller;

import com.theelitelions20.HurricanePredictor.model.home.Home;
import com.theelitelions20.HurricanePredictor.model.home.HomeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HomeController {

    @Autowired
    private HomeDao homeDao;

    @GetMapping("/home/get-all")
    public List<Home> getAllHomes(){
        return homeDao.getAllHomes();
    }

    @PostMapping("/home/save")
    public Home save(@RequestBody Home home){
        return homeDao.save(home);
    }

    @DeleteMapping("/home/delete/{id}")
    public ResponseEntity<Void> deleteHomeById(@PathVariable int id){
        boolean isDeleted = homeDao.deleteHomeById(id);
        if(isDeleted){
            return ResponseEntity.noContent().build(); //204 No Content
        }
        else{
            return ResponseEntity.notFound().build(); //404 Not Found
        }
    }

    @PutMapping("/home/update/{id}")
    public ResponseEntity<Home> updateHome(@PathVariable int id, @RequestBody Home updatedHome){
        Home home = homeDao.updateHome(id, updatedHome);
        if(home != null){
            return ResponseEntity.ok(home); // 200 Ok
        }
        else{
            return ResponseEntity.notFound().build(); //404 Not Found
        }
    }
}
