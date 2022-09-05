package com.example.dynamic_data_mapper_assessment.service.serviceImpl;

import com.example.dynamic_data_mapper_assessment.dtos.InformationDto;
import com.example.dynamic_data_mapper_assessment.models.Information;
import com.example.dynamic_data_mapper_assessment.models.ProviderDatas;
import com.example.dynamic_data_mapper_assessment.repositories.InformationRepository;
import com.example.dynamic_data_mapper_assessment.service.InformationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InformationServiceImpl  implements InformationService {
    private final InformationRepository informationRepository;

    @Override
    public String saveAllData(ProviderDatas providerData) {

        List<Information> allInfo = new ArrayList<>();

        for(var data : providerData.getDatas()){
            Information info = new Information();
            info.setName(data.getName());
            info.setFName(data.getName().toLowerCase().split(" ")[0]);
            info.setLName(data.getName().toLowerCase().split(" ")[1]);
            info.setAge(data.getAge());
            info.setTimestamp(data.getTimestamp());
            info.setProviderId(providerData.getProviderId());
            allInfo.add(info);
        }

        informationRepository.saveAll(allInfo);
        return "Saved successfully";

    }

    @Override
    public InformationDto getData(String fName, Integer age, Timestamp timestamp, Long providerId) {

        Information information = informationRepository.getInformation(fName.toLowerCase(), age, timestamp, providerId);
        InformationDto info = new InformationDto();
        info.setAge(information.getAge());
        info.setTimestamp(information.getTimestamp());
        info.setName(information.getName());
        return info;
    }
}