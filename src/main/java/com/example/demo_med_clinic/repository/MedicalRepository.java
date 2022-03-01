package com.example.demo_med_clinic.repository;

import com.example.demo_med_clinic.model.MedicalHistory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.OptionalLong;

@Repository
public interface MedicalRepository extends CrudRepository<MedicalHistory, Long> {
    static OptionalLong findById(long id) {
        return OptionalLong.empty();
    }

}
