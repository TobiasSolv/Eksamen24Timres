package com.example.teaterprojekt.Model;

import jakarta.persistence.*;

@Entity
public class BoatRace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boatraceid")

    private int boatRaceId;

    private int boatRaceType;

    private int boatRacePoints;

    public int getBoatRaceId() {
        return boatRaceId;
    }

    public void setBoatRaceId(int boatRaceId) {
        this.boatRaceId = boatRaceId;
    }

    public int getBoatRaceType() {
        return boatRaceType;
    }

    public void setBoatRaceType(int boatRaceType) {
        this.boatRaceType = boatRaceType;
    }

    public int getBoatRacePoints() {
        return boatRacePoints;
    }

    public void setBoatRacePoints(int boatRacePoints) {
        this.boatRacePoints = boatRacePoints;
    }



}
