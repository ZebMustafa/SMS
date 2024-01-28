package com.mockitocourse.qa.mapper;

import com.mockitocourse.qa.entity.SystemParameterEntity;
import com.mockitocourse.qa.vo.system.parameter.SystemParameter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Slf4j
@Service
public class SystemParameterMapper implements QAMapper<SystemParameterEntity, SystemParameter> {
    @Override
    public SystemParameter map(SystemParameterEntity sourceObject) {
        return SystemParameter.builder()
                .id(sourceObject.getId())
                .value(sourceObject.getValue())
                .statusCode(sourceObject.getStatusCode())
                .build();
    }

    @Override
    public List<SystemParameter> map(List<SystemParameterEntity> sourceObjectList) {
        log.info("Going to prepare system parameter list");
        return sourceObjectList.stream()
                .map(this::map)
                .collect(Collectors.toList());
    }
}
