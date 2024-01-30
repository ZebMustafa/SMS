package com.mockitocourse.qa.service;

import com.mockitocourse.qa.entity.SystemParameterEntity;
import com.mockitocourse.qa.mapper.QAMapper;
import com.mockitocourse.qa.repository.SystemParameterRepository;
import com.mockitocourse.qa.vo.system.parameter.CountryFlag;
import com.mockitocourse.qa.vo.system.parameter.CustomImplementation;
import com.mockitocourse.qa.vo.system.parameter.SystemParameter;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
@AllArgsConstructor
public class SystemParameterService {
    private final QAMapper<SystemParameterEntity, SystemParameter> systemParameterQAMapper;
    private final SystemParameterRepository systemParameterRepository;
    public List<SystemParameter> getAll(){
        log.info("SystemParameterService: Going to get all the system parameter data");
        return systemParameterQAMapper.map(systemParameterRepository.findAll());
    }

    public CountryFlag getCountryFlag(){
        SystemParameterEntity byId = systemParameterRepository.findById("123");
        return CustomImplementation.prepareCountryFlag(systemParameterQAMapper.map(byId));
    }
}
