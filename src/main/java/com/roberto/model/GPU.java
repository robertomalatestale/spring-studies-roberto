package com.roberto.model;

import java.beans.ConstructorProperties;

public class GPU {
    private String model;
    private Double clockSpeed;


    @ConstructorProperties({"model","clockSpeed"})
    public GPU(String model, Double clockSpeed) {
        this.model = model;
        this.clockSpeed = clockSpeed;
    }

    public String getModel() {
        return model;
    }

    public Double getClockSpeed() {
        return clockSpeed;
    }
}
