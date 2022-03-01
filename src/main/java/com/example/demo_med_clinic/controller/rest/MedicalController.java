package com.example.demo_med_clinic.controller.rest;


import com.example.demo_med_clinic.model.MedicalHistory;
import com.example.demo_med_clinic.service.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/medical")
public class MedicalController {

    @Autowired
    private MedicalService service;


    @GetMapping(value = "/medical/all")
    public ResponseEntity<List<MedicalHistory>> create(@RequestBody MedicalHistory med_history){

        service.findAll();

        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping(value = "/medcal/one")
    public ResponseEntity<MedicalHistory> create(@RequestBody Long id) {

        MedicalHistory med_history = service.findOne(id);

        if (med_history == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(med_history, HttpStatus.OK);
    }



    @PostMapping(value = "/medical/add")
    public ResponseEntity<MedicalHistory> registrar(@RequestBody MedicalHistory med_history) {

        service.add(med_history);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @PutMapping(value = "/medical/edit")
    public ResponseEntity<MedicalHistory> actualize(@RequestBody MedicalHistory med_history, Long id) {

        service.edit(id, med_history);

        return new ResponseEntity<>(HttpStatus.OK);
    }


    @DeleteMapping(value = "/medical/del")
    public ResponseEntity<Long> eliminate(@PathVariable Long id) {

        MedicalHistory md = service.findOne(id);

        if (md == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        service.removeOne(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }


}



