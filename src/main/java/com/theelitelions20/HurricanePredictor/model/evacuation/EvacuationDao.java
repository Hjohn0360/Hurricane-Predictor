package com.theelitelions20.HurricanePredictor.model.evacuation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EvacuationDao {

    @Autowired
    private EvacuationRepository repository;

    public Evacuation save(Evacuation evacuation){
        return repository.save(evacuation);
    }

    public List<Evacuation> getAllEvacuations(){
        List<Evacuation> evacuations = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(evacuations :: add);
        return evacuations;
    }

    public boolean deleteEvacuationById(int id){
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}
