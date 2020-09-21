package com.ayushi.colors.service.impl;

import com.ayushi.colors.enums.Colors;
import com.ayushi.colors.service.ColorService;

import java.util.Arrays;

public class ColorServiceImpl implements ColorService {

    public ColorServiceImpl() {
    }

    public String getColorInfo(String color){
        Colors colors =
                Arrays.asList(Colors.values()).stream()
                        .filter(
                                colorInfo ->
                                        (colorInfo.getColor().equals(color)))
                        .findFirst()
                        .orElse(null);
        return colors.getInfo();
    }
}
