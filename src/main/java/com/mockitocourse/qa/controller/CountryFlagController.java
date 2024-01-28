package com.mockitocourse.qa.controller;

import com.mockitocourse.qa.service.SystemParameterService;
import com.mockitocourse.qa.vo.system.parameter.CountryFlag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Slf4j
@AllArgsConstructor
@RestController
public class CountryFlagController {
    private final SystemParameterService systemParameterService;

    @GetMapping("/countryFlag")
    public ResponseEntity<CountryFlag> getCountryFlags() {
        log.info("Get country flags from the database.");
        return new ResponseEntity<>(systemParameterService.getCountryFlag(), HttpStatus.OK);
    }
}
