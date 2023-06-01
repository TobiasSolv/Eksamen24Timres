package com.example.teaterprojekt.Controller;

import com.example.teaterprojekt.Model.Boat;
import com.example.teaterprojekt.Model.BoatRace;
import com.example.teaterprojekt.service.BoatRaceService;
import com.example.teaterprojekt.service.BoatService;
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
    public List<BoatRace> getAllProduct() {
        return boatraceService.getAllProducts();
    }

    @PostMapping("/product")
    public ResponseEntity<BoatRace> createBoat(@RequestBody Boat boat) {
        Boat newBoat = boatraceService.createBoatrace(boat);
        return new ResponseEntity<>(newBoatRace, HttpStatus.CREATED);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<BoatRace> updateBoat(@PathVariable("id") Integer id, @RequestBody Boat boat) {
        return new ResponseEntity<>(boatraceService.updateBoat(id, boat), HttpStatus.OK);
    }

    @DeleteMapping("/product/{id}")
    public ResponseEntity<BoatRace> deleteBoat(@PathVariable("id") Integer id) {
        boatraceService.deleteBoat(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
