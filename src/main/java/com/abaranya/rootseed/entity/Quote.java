package com.abaranya.rootseed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Quote implements Serializable {

    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;

    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private @Getter String symbol;

    @Column
    private  @Getter float value = 0.0f;

    @Column
    private  @Getter LocalDateTime dateTime;

    public Quote(String symbol, float value, LocalDateTime dateTime) {
        this.dateTime = dateTime;
        this.symbol = symbol;
        this.value = value;
    }

    public Quote() {

    }
}
