package com.example.template.domain.model;

import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class User {

    private Long id;

    private String station;
    private ZonedDateTime localTime;
    private ZonedDateTime receptionTime;
    private Float humidity;
    private Float windSpeed;
    private Float temperature;

}
