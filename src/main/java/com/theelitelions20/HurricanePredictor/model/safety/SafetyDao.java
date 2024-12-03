package com.theelitelions20.HurricanePredictor.model.safety;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SafetyDao {
    @Autowired
    private SafetyRepository repository;

    public Safety save(Safety safety){
        return repository.save(safety);
    }

    public List<Safety> getAllSafeties(){
        List<Safety> safeties = new ArrayList<>();
        Streamable.of(repository.findAll())
                .forEach(safeties:: add);
        return safeties;
    }

    public Safety updateSafety(int id, Safety updatedSafety){
        return repository.findById(id)
                .map(safety -> {
                    safety.setBatteries(updatedSafety.isBatteries());
                    safety.setWater(updatedSafety.isWater());
                    safety.setFood(updatedSafety.isFood());
                    safety.setGas(updatedSafety.isGas());
                    safety.setCash(updatedSafety.isCash());
                    safety.setPortableChargers(updatedSafety.isPortableChargers());
                    safety.setImportantDeadlines(updatedSafety.isImportantDeadlines());
                    safety.setMedications(updatedSafety.isMedications());
                    safety.setNoaaWeatherRadio(updatedSafety.isNoaaWeatherRadio());
                    safety.setFlashlightswithextrabatteries(updatedSafety.isFlashlightswithextrabatteries());
                    safety.setBlanketsorsleepingbags(updatedSafety.isBlanketsorsleepingbags());
                    safety.setEmergencycontactslist(updatedSafety.isEmergencycontactslist());
                    safety.setFirstaidkit(updatedSafety.isFirstaidkit());
                    return repository.save(safety);
                })
                .orElse(null);
    }

}
