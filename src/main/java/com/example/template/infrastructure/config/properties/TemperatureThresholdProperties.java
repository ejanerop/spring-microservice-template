package com.example.template.infrastructure.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import lombok.Data;

@Data
@ConfigurationProperties(prefix = "task.temperature")
public class TemperatureThresholdProperties {

    private Double threshold = null;

}
