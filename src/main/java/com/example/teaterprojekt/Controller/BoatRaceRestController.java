package com.example.teaterprojekt.Controller;

import com.example.teaterprojekt.Model.BoatRace;
import com.example.teaterprojekt.service.BoatRaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class BoatRaceRestController {

    @Autowired
    BoatRaceService boatraceService;

    @GetMapping("/products")
    public List<BoatRace> getAllBoatRace() {
        return boatraceService.getAllBoatRace();
    }

    @PostMapping("/product")
    public ResponseEntity<BoatRace> createBoatRace(@RequestBody BoatRace boatRace) {
        BoatRace newBoatRace = boatraceService.createBoatRace(boatRace);
        return new ResponseEntity<>(newBoatRace, HttpStatus.CREATED);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<BoatRace> updateBoatRace(@PathVariable("id") Integer id, @RequestBody BoatRace boatRace) {
        return new ResponseEntity<>(boatraceService.updateBoatRace(id, boatRace), HttpStatus.OK);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<BoatRace> deleteBoatRace(@PathVariable("id") Integer id) {
        boatraceService.deleteBoatRace(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
