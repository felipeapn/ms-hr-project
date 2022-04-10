package com.felipeapn.hrpayroll.entities;

import lombok.Data;

import java.io.Serializable;

@Data
public class Worker implements Serializable {

    private Long id;
    private String name;
    private Double dailyIncome;

}
