package com.example.demo_med_clinic.repository;

import com.example.demo_med_clinic.model.PatientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.OptionalLong;

@Repository
public interface PatientRepository extends CrudRepository<PatientEntity, Long> {
    static OptionalLong findById(long id) {

       return OptionalLong.empty();
    }

}

