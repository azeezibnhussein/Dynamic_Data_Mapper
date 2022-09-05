package com.example.dynamic_data_mapper_assessment.dtos;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Setter
@Getter
public class InformationDto {
    private String name;
    private Integer age;
    private Timestamp timestamp;
}
