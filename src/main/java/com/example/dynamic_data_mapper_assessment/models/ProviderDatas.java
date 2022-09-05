package com.example.dynamic_data_mapper_assessment.models;

import java.sql.Timestamp;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.Data;

@Data @Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class ProviderDatas {

    @JsonProperty("providerId")
    private Integer providerId;
    @JsonProperty("data")
    private List<Datum> datas = null;
    //
    @Data @Setter @Getter @NoArgsConstructor @AllArgsConstructor
    public static class Datum {

        @JsonProperty("name")
        private String name;
        @JsonProperty("age")
        private Integer age;
        @JsonProperty("timestamp")
        private Timestamp timestamp;


    }

}