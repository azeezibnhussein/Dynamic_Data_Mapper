package com.example.dynamic_data_mapper_assessment.repositories;

import com.example.dynamic_data_mapper_assessment.models.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface InformationRepository extends JpaRepository<Information, Long> {


    @Query("Select information from Information information where information.fName = ?1 and information.age = ?2 and information.timestamp = ?3 and information.providerId = ?4")
    Information getInformation(String fName, Integer age, Timestamp timestamp, Long providerId);
}