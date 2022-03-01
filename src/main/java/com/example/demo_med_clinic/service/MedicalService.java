package com.example.demo_med_clinic.service;

import com.example.demo_med_clinic.model.MedicalHistory;
import com.example.demo_med_clinic.repository.MedicalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class MedicalService {


    private MedicalRepository medRepository;


    //редактирование

    public MedicalHistory edit(Long id, MedicalHistory new_history) {
        MedicalHistory oldHistory = findOne(id);
        if (new_history.getPatient() != null) oldHistory.setPatient(new_history.getPatient());
        if (new_history.getDocNumber() != null) oldHistory.setDocNumber(new_history.getDocNumber());
        if (new_history.getCreateDttm() != null) oldHistory.setCreateDttm(new_history.getCreateDttm());
        if (new_history.getModifyDttm() != null) oldHistory.setModifyDttm(new_history.getModifyDttm());
        if (new_history.getDoctor() != null) oldHistory.setDoctor(new_history.getDoctor());
        if (new_history.getDiagnosis() != null) oldHistory.setDiagnosis(new_history.getDiagnosis());
        if (new_history.getMedicalHistory() != null) oldHistory.setMedicalHistory(new_history.getMedicalHistory());

        return medRepository.save(oldHistory);
    }

    //добавление


    public MedicalHistory add(MedicalHistory add_history) {
        return medRepository.save(add_history);

    }



    //поиск всех

    public List<MedicalHistory> findAll() {

        return (List<MedicalHistory>) medRepository.findAll();
    }

    //поиск по id

    public MedicalHistory findOne(Long id) {
        return medRepository.findById(id).orElseThrow(()
                -> new NoSuchElementException("Medical History with id='" + id + "' does not exist"));

    }

    //удаление

    public void removeOne(Long id) {

        medRepository.deleteById(id);
    }


}
