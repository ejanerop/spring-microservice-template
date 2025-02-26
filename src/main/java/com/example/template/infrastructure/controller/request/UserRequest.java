package com.example.template.infrastructure.controller.request;

import java.time.ZonedDateTime;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UserRequest {

    @NotNull
    private ZonedDateTime localTime;
    @NotNull
    @DecimalMin("0.0")
    @DecimalMax("500.0")
    private Double windSpeed;
    @NotNull
    @DecimalMin("0.0")
    @DecimalMax("100.0")
    private Double humidity;
    @NotNull
    @DecimalMin("-100.0")
    @DecimalMax("70.0")
    private Double temperature;

}
