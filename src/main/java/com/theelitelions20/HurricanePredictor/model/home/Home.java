package com.theelitelions20.HurricanePredictor.model.home;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Home {

    // NOTE -- the weather predictor api key: 0475f8c5c182876e1831160786d5f7c7
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float currentWindSpeed;
    private float windGusts;
    private boolean stormNearby;
    private String hurricaneName;
    private LocalDateTime hurricaneArrivalTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCurrentWindSpeed() {
        return currentWindSpeed;
    }

    public void setCurrentWindSpeed(float currentWindSpeed) {
        this.currentWindSpeed = currentWindSpeed;
    }

    public float getWindGusts() {
        return windGusts;
    }

    public void setWindGusts(float windGusts) {
        this.windGusts = windGusts;
    }

    public boolean isStormNearby() {
        return stormNearby;
    }

    public void setStormNearby(boolean stormNearby) {
        this.stormNearby = stormNearby;
    }

    public String getHurricaneName() {
        return hurricaneName;
    }

    public void setHurricaneName(String hurricaneName) {
        this.hurricaneName = hurricaneName;
    }

    public LocalDateTime getHurricaneArrivalTime() {
        return hurricaneArrivalTime;
    }

    public void setHurricaneArrivalTime(LocalDateTime hurricaneArrivalTime) {
        this.hurricaneArrivalTime = hurricaneArrivalTime;
    }

    @Override
    public String toString(){
        return "Home{" +
                "id=" + id +
                ", current wind speed='" + currentWindSpeed + '\'' +
                ", wind gusts='" + windGusts + '\'' +
                ", storm nearby=" + stormNearby + '\'' +
                ", hurricane name='" + hurricaneName + '\'' +
                ", hurricane arrival time='" + hurricaneArrivalTime + '\'' +
                '}';
    }
}
