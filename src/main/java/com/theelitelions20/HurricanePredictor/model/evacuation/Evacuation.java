package com.theelitelions20.HurricanePredictor.model.evacuation;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity

public class Evacuation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Shelter;
    private String ShelterAddress;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getShelter() {
        return Shelter;
    }

    public void setShelter(String shelter) {
        Shelter = shelter;
    }

    public String getShelterAddress() {
        return ShelterAddress;
    }

    public void setShelterAddress(String shelterAddress) {
        ShelterAddress = shelterAddress;
    }
}
