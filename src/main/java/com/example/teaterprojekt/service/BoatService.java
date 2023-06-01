package com.example.teaterprojekt.service;

import com.example.teaterprojekt.Model.Boat;
import com.example.teaterprojekt.Repository.BoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoatService {

    @Autowired
    BoatRepository boatRepository;
    public List<Boat> getAllBoat() {
        return boatRepository.findAll();
    }

    public Boat createBoat(Boat boat) {

        return boatRepository.save(boat);
    }

    public Boat updateBoat(Integer id, Boat boat) {
        if (boatRepository.findById(id).isEmpty()) {
            return null;
        }
        return boatRepository.save(boat);
    }

    public void deleteBoat(Integer id) {

        boatRepository.deleteById(id);
    }

}
