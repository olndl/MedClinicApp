package com.example.demo_med_clinic.controller.rest;

import com.example.demo_med_clinic.model.PatientEntity;
import com.example.demo_med_clinic.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService service;


    @GetMapping(value = "/patient/all")
    public ResponseEntity<List<PatientEntity>> create(@RequestBody PatientEntity patient){

        service.findAll();

        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping(value = "/patient/one")
    public ResponseEntity<PatientEntity> create(@RequestBody Long id) {

        PatientEntity patient = service.findOne(id);

        if (patient == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }



    @PostMapping(value = "/patient/add")
    public ResponseEntity<Object> registrar(@RequestBody PatientEntity patient) {

        service.add(patient);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @PutMapping(value = "/patient/edit")
    public ResponseEntity<PatientEntity> actualize(@RequestBody PatientEntity patient, Long id) {

        service.edit(id, patient);

        return new ResponseEntity<>(HttpStatus.OK);
    }


    @DeleteMapping(value = "/patient/del")
    public ResponseEntity<Long> eliminate(@PathVariable Long id) {

        PatientEntity pac = service.findOne(id);

        if (pac == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        service.removeOne(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
