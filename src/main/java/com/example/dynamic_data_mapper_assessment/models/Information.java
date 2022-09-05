package com.example.dynamic_data_mapper_assessment.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class Information {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;
    private String fName;
    private String name;
    private String lName;
    private Integer age;
    private Timestamp timestamp;
    private Integer providerId;
}