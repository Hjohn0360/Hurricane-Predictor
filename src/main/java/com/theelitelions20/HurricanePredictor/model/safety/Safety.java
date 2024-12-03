package com.theelitelions20.HurricanePredictor.model.safety;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Safety {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean Batteries;
    private boolean Water;
    private boolean Food;
    private boolean Gas;
    private boolean Cash;
    private boolean Medications;
    private boolean Firstaidkit;
    private boolean PortableChargers;
    private boolean ImportantDeadlines;
    private boolean EvacuationsLocation;
    private boolean NoaaWeatherRadio;
    private boolean Flashlightswithextrabatteries;
    private boolean Blanketsorsleepingbags;
    private boolean Emergencycontactslist;
    private boolean additionalitem;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBatteries() {
        return Batteries;
    }

    public void setBatteries(boolean batteries) {
        Batteries = batteries;
    }

    public boolean isWater() {
        return Water;
    }

    public void setWater(boolean water) {
        Water = water;
    }

    public boolean isFood() {
        return Food;
    }

    public void setFood(boolean food) {
        Food = food;
    }

    public boolean isGas() {
        return Gas;
    }

    public void setGas(boolean gas) {
        Gas = gas;
    }

    public boolean isCash() {
        return Cash;
    }

    public void setCash(boolean cash) {
        Cash = cash;
    }

    public boolean isMedications() {
        return Medications;
    }

    public void setMedications(boolean medications) {
        Medications = medications;
    }

    public boolean isFirstaidkit() {
        return Firstaidkit;
    }

    public void setFirstaidkit(boolean firstaidkit) {
        Firstaidkit = firstaidkit;
    }

    public boolean isPortableChargers() {
        return PortableChargers;
    }

    public void setPortableChargers(boolean portableChargers) {
        PortableChargers = portableChargers;
    }

    public boolean isImportantDeadlines() {
        return ImportantDeadlines;
    }

    public void setImportantDeadlines(boolean importantDeadlines) {
        ImportantDeadlines = importantDeadlines;
    }

    public boolean isEvacuationsLocation() {
        return EvacuationsLocation;
    }

    public void setEvacuationsLocation(boolean evacuationsLocation) {
        EvacuationsLocation = evacuationsLocation;
    }

    public boolean isNoaaWeatherRadio() {
        return NoaaWeatherRadio;
    }

    public void setNoaaWeatherRadio(boolean noaaWeatherRadio) {
        NoaaWeatherRadio = noaaWeatherRadio;
    }

    public boolean isFlashlightswithextrabatteries() {
        return Flashlightswithextrabatteries;
    }

    public void setFlashlightswithextrabatteries(boolean flashlightswithextrabatteries) {
        Flashlightswithextrabatteries = flashlightswithextrabatteries;
    }

    public boolean isBlanketsorsleepingbags() {
        return Blanketsorsleepingbags;
    }

    public void setBlanketsorsleepingbags(boolean blanketsorsleepingbags) {
        Blanketsorsleepingbags = blanketsorsleepingbags;
    }

    public boolean isEmergencycontactslist() {
        return Emergencycontactslist;
    }

    public void setEmergencycontactslist(boolean emergencycontactslist) {
        Emergencycontactslist = emergencycontactslist;
    }

    public boolean isAdditionalitem() {
        return additionalitem;
    }

    public void setAdditionalitem(boolean additionalitem) {
        this.additionalitem = additionalitem;
    }
}
