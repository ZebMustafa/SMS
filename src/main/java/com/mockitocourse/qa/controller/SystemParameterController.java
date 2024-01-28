package com.mockitocourse.qa.controller;

import com.mockitocourse.qa.service.SystemParameterService;
import com.mockitocourse.qa.vo.system.parameter.SystemParameter;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@AllArgsConstructor
public class SystemParameterController {

    private final SystemParameterService systemParameterService;

    @GetMapping("/all")
    public ResponseEntity<List<SystemParameter>> getAllSystemParameters() {
        log.info("In system parameter controller, going to fetch all parameters.");
        return new ResponseEntity<>(systemParameterService.getAll(), HttpStatus.OK);
    }
}
