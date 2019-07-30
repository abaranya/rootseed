package com.abaranya.rootseed.entity;

import javax.persistence.Entity;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Quote implements Serializable {
    String symbol;
    float value = 0.0f;
    LocalDateTime dateTime;

    public Quote(String symbol, float value, LocalDateTime dateTime) {
        this.dateTime = dateTime;
        this.symbol = symbol;
        this.value = value;
    }

    public Quote() {

    }
}
