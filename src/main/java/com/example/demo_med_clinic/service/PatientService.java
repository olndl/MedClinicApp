package com.example.demo_med_clinic.service;

import com.example.demo_med_clinic.model.PatientEntity;
import com.example.demo_med_clinic.repository.PatientRepository;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.NoSuchElementException;


@Service
public class PatientService {

    private PatientRepository patientRepository;


    //редактирование


    public PatientEntity edit(Long id, PatientEntity new_patient) {
        PatientEntity oldPatient = findOne(id);
        if (new_patient.getName() != null) oldPatient.setName(new_patient.getName());
        if (new_patient.getGender() != null) oldPatient.setGender(new_patient.getGender());
        if (new_patient.getAge() != null) oldPatient.setAge(new_patient.getAge());
        if (new_patient.getCity() != null) oldPatient.setCity(new_patient.getCity());
        if (new_patient.getAddress() != null) oldPatient.setAddress(new_patient.getAddress());
        if (new_patient.getBirthdayDt() != null) oldPatient.setBirthdayDt(new_patient.getBirthdayDt());
        if (new_patient.getBirthPlace() != null) oldPatient.setBirthPlace(new_patient.getBirthPlace());
        if (new_patient.getRegistration() != null) oldPatient.setRegistration(new_patient.getRegistration());
        if (new_patient.getPassportSeries() != null) oldPatient.setPassportSeries(new_patient.getPassportSeries());
        if (new_patient.getPassportNumber() != null) oldPatient.setPassportNumber(new_patient.getPassportNumber());
        if (new_patient.getPhoneNumber() != null) oldPatient.setPhoneNumber(new_patient.getPhoneNumber());
        if (new_patient.getAnotherDocument() != null) oldPatient.setAnotherDocument(new_patient.getAnotherDocument());

        return patientRepository.save(oldPatient);
    }

    //добавление

    public PatientEntity add(PatientEntity add_patient) {

        return patientRepository.save(add_patient);
    }

    //поиск всех

    public List<PatientEntity> findAll() {

        return (List<PatientEntity>) patientRepository.findAll();
    }

    //поиск по id

    public PatientEntity findOne(Long id) {
        return patientRepository.findById(id).orElseThrow(()
                -> new NoSuchElementException("USER with id='" + id + "' does not exist"));

    }

    //удаление

        public void removeOne(Long id) {

        patientRepository.deleteById(id);
    }


}
