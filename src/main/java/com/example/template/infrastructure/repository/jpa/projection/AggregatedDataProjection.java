package com.example.template.infrastructure.repository.jpa.projection;

public interface AggregatedDataProjection {

    Double getMinTemperature();

    Double getMaxTemperature();

    Double getAvgTemperature();

    Double getMinHumidity();

    Double getMaxHumidity();

    Double getAvgHumidity();

    Double getMinWindSpeed();

    Double getMaxWindSpeed();

    Double getAvgWindSpeed();

}
