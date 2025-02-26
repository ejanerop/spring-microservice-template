package com.example.template.infrastructure.controller.response;

import java.time.ZonedDateTime;
import lombok.Data;

@Data
public class UserResponse {

    private Long id;

    private String station;
    private ZonedDateTime localTime;
    private ZonedDateTime receptionTime;
    private Float humidity;
    private Float windSpeed;
    private Float temperature;

}
