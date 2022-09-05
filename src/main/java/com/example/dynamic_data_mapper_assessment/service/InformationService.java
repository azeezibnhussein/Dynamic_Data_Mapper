package com.example.dynamic_data_mapper_assessment.service;

import com.example.dynamic_data_mapper_assessment.dtos.InformationDto;
import com.example.dynamic_data_mapper_assessment.models.ProviderDatas;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public interface InformationService {
    String saveAllData(ProviderDatas providerData);
    InformationDto getData(String fName, Integer age, Timestamp timestamp, Long providerId);
}
