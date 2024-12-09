package com.theelitelions20.HurricanePredictor.controller;

import com.theelitelions20.HurricanePredictor.model.safety.Safety;
import com.theelitelions20.HurricanePredictor.model.safety.SafetyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class SafetyController {

    @Autowired
    private SafetyDao safetyDao;

    @GetMapping("/safety/get-all")
    public List<Safety> getAllSafeties(){
        return safetyDao.getAllSafeties();
    }

    @PostMapping("/safety/save")
    public Safety save(@RequestBody Safety safety){
        return safetyDao.save(safety);
    }

    @DeleteMapping("/safety/delete/{id}")
    public ResponseEntity<Void> deleteSafetyById(@PathVariable int id){
        boolean isDeleted = safetyDao.deleteSafetyById(id);
        if(isDeleted){
            return ResponseEntity.noContent().build(); //204 No Content
        }
        else{
            return ResponseEntity.notFound().build(); //404 Not Found
        }
    }
    @PutMapping("/safety/update/{id}")
    public ResponseEntity<Safety> updateSafety(@PathVariable int id, @RequestBody Safety updatedSafety){
        Safety safety = safetyDao.updateSafety(id, updatedSafety);
        if(safety != null){
            return ResponseEntity.ok(safety); // 200 Ok
        }
        else{
            return ResponseEntity.notFound().build(); //404 Not Found
        }
    }
}

