package com.mockitocourse.qa.vo.system.parameter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;
@Slf4j
public class CustomImplementation {
    private static ObjectMapper objectMapper = new ObjectMapper();
    public static CountryFlag prepareCountryFlag(SystemParameter sourceObj){
        // convert String(json object) to CountryFlag ( Map)
        Map<String,Object> resultMap = null;
        try {
            log.info(sourceObj.getValue());
            resultMap = objectMapper.readValue(sourceObj.getValue(), Map.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return CountryFlag.builder()
                .values(resultMap)
                .build();
    }
}
