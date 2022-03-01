package com.example.demo_med_clinic.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Clinica")
@Table(name = "Clinica")
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalHistory {

    @JsonProperty(value = "id")
    @Id
    @Column(name = "id")
    private long id;

    @JsonProperty(value = "patient")
    @Column(name = "patient", nullable = false)
    private String patient;

    @JsonProperty(value = "docNumber")
    @Column(name = "docNumber", nullable = false)
    private String docNumber;

    @JsonProperty(value = "createDttm")
    @Column(name = "createDttm", nullable = false)
    private Date createDttm;

    @JsonProperty(value = "modifyDttm")
    @Column(name = "modifyDttm", nullable = false)
    private Date modifyDttm;

    @JsonProperty(value = "doctor")
    @Column(name = "doctor", nullable = false)
    private String doctor;

    @JsonProperty(value = "diagnosis")
    @Column(name = "diagnosis", nullable = false)
    private String diagnosis;

    @JsonProperty(value = "medicalHistory")
    @Column(name = "medicalHistory", nullable = false)
    private String medicalHistory;


}
