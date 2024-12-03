package com.theelitelions20.HurricanePredictor.model.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeDao {

    @Autowired
    private HomeRepository repository;

    public Home save(Home home){
        return repository.save(home);
    }

    public List<Home> getAllHomes(){
        List<Home> homes = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(homes :: add);
        return homes;
    }

    public boolean deleteHomeById(int id){
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public Home updateHome(int id, Home updatedHome){
        return repository.findById(id)
                .map(home -> {
                    home.setCurrentWindSpeed(updatedHome.getCurrentWindSpeed());
                    home.setWindGusts(updatedHome.getWindGusts());
                    home.setStormNearby(updatedHome.isStormNearby());
                    home.setHurricaneName(updatedHome.getHurricaneName());
                    home.setHurricaneArrivalTime(updatedHome.getHurricaneArrivalTime());
                    return repository.save(home);
                })
                .orElse(null);
    }
}
