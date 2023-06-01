package com.example.teaterprojekt.service;


import com.example.teaterprojekt.Model.BoatRace;
import com.example.teaterprojekt.Repository.BoatRaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoatRaceService {

    @Autowired
    BoatRaceRepository boatRaceRepository;
    public List<BoatRace> getAllBoatRace() {
        return boatRaceRepository.findAll();
    }

    public BoatRace createBoatRace(BoatRace boat) {

        return boatRaceRepository.save(boat);
    }

    public BoatRace updateBoatRace(Integer id, BoatRace boatRace) {
        if (boatRaceRepository.findById(id).isEmpty()) {
            return null;
        }
        return boatRaceRepository.save(boatRace);
    }

    public void deleteBoatRace(Integer id) {

        boatRaceRepository.deleteById(id);
    }

}
