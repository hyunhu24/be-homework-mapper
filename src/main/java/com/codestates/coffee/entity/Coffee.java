package com.codestates.coffee.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coffee {
    private Long coffeeId;
    private String korName;
    private String engName;
    private int price;
}
