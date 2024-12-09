package com.theelitelions20.HurricanePredictor.controller;

import com.theelitelions20.HurricanePredictor.model.evacuation.Evacuation;
import com.theelitelions20.HurricanePredictor.model.evacuation.EvacuationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EvacuationController {

    @Autowired
    private EvacuationDao evacuationDao;

    @GetMapping("/evacuation/get-all")
    public List<Evacuation> getAllEvacuations(){
        return evacuationDao.getAllEvacuations();
    }

    @PostMapping("/evacuation/save")
    public Evacuation save(@RequestBody Evacuation evacuation){
        return evacuationDao.save(evacuation);
    }

    @DeleteMapping("/evacuation/delete/{id}")
    public ResponseEntity<Void> deleteEvacuationById(@PathVariable int id){
        boolean isDeleted = evacuationDao.deleteEvacuationById(id);
        if(isDeleted){
            return ResponseEntity.noContent().build(); //204 No Content
        }
        else{
            return ResponseEntity.notFound().build(); //404 Not Found
        }
    }

}
