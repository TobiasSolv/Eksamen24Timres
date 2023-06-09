package com.example.teaterprojekt.Controller;


import com.example.teaterprojekt.Model.Boat;
import com.example.teaterprojekt.service.BoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class BoatRestController {

    @Autowired
    BoatService boatService;

    @GetMapping("/boats")
    public List<Boat> getAllBoat() {
        return boatService.getAllBoat();
    }

    @PostMapping("/boat")
    public ResponseEntity<Boat> createBoat(@RequestBody Boat boat) {
        Boat newBoat = boatService.createBoat(boat);
        return new ResponseEntity<>(newBoat, HttpStatus.CREATED);
    }

    @PutMapping("/boat/{id}")
    public ResponseEntity<Boat> updateBoat(@PathVariable("id") Integer id, @RequestBody Boat boat) {
        return new ResponseEntity<>(boatService.updateBoat(id, boat), HttpStatus.OK);
    }

    @DeleteMapping("/boat/{id}")
    public ResponseEntity<Boat> deleteBoat(@PathVariable("id") Integer id) {
        boatService.deleteBoat(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
