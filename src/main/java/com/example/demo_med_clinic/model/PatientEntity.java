package com.example.demo_med_clinic.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Patient")
@Table(name = "Patient")
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatientEntity {

    @JsonProperty(value = "id")
    @Id
    @Column(name = "id")
    private Long id;

    @JsonProperty(value = "name")
    @Column(name = "name", nullable = false)
    private String name;

    @JsonProperty(value = "gender")
    @Column(name = "gender", nullable = false)
    private String gender;

    @JsonProperty(value = "age")
    @Column(name = "age", nullable = false)
    private Integer age;

    @JsonProperty(value = "city")
    @Column(name = "city", nullable = false)
    private String city;

    @JsonProperty(value = "address")
    @Column(name = "address", nullable = false)
    private String address;

    @JsonProperty(value = "birthdayDt")
    @Column(name = "birthdayDt", nullable = false)
    private Date birthdayDt;

    @JsonProperty(value = "birthPlace")
    @Column(name = "birthPlace", nullable = false)
    private String birthPlace;

    @JsonProperty(value = "registration")
    @Column(name = "registration", nullable = false)
    private String registration;

    @JsonProperty(value = "passportSeries")
    @Column(name = "passportSeries", nullable = false)
    private String passportSeries;

    @JsonProperty(value = "passportNumber")
    @Column(name = "passportNumber", nullable = false)
    private String passportNumber;

    @JsonProperty(value = "phoneNumber")
    @Column(name = "phoneNumber", nullable = false)
    private String phoneNumber;

    @JsonProperty(value = "anotherDocument")
    @Column(name = "anotherDocument", nullable = false)
    private String anotherDocument;


}