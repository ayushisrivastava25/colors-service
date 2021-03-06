package com.ayushi.colors.controller;

import com.ayushi.colors.service.ColorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorController {

    private ColorService colorService;

    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }

    @GetMapping("/v1/color/{color}")
    public ResponseEntity<String> getColorInfo(@PathVariable("color") String color) {
        return ResponseEntity.ok(colorService.getColorInfo(color));
    }
}
