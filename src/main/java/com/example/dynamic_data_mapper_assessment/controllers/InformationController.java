package com.example.dynamic_data_mapper_assessment.controllers;

import com.example.dynamic_data_mapper_assessment.dtos.InformationDto;
import com.example.dynamic_data_mapper_assessment.models.ProviderDatas;
import com.example.dynamic_data_mapper_assessment.service.serviceImpl.InformationServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
@RequiredArgsConstructor
public class InformationController {
    private final InformationServiceImpl informationService;

    @PostMapping("/save")
    public String SaveInfo(@RequestBody ProviderDatas providerData){
        return informationService.saveAllData(providerData);
    }

    @GetMapping("/filter/{providerId}")
    public InformationDto getInformation(@PathVariable Long providerId, @RequestParam String name, @RequestParam Integer age, @RequestParam Timestamp timestamp) {
        return informationService.getData(name, age, timestamp,providerId);
    }
}