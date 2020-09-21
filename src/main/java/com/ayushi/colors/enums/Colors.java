package com.ayushi.colors.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Colors {

    SKY_BLUE("SKY_BLUE", "pure"),
    YELLOW("YELLOW", "sunshine"),
    BLACK("BLACK", "strength/darkness"),
    RED("RED", "strength/passion"),
    GREEN("GREEN", "nature/earth");

    private String color;
    private String info;
}