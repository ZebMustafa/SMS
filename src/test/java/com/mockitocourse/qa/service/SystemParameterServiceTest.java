package com.mockitocourse.qa.service;

import com.mockitocourse.qa.entity.SystemParameterEntity;
import com.mockitocourse.qa.mapper.QAMapper;
import com.mockitocourse.qa.repository.SystemParameterRepository;
import com.mockitocourse.qa.vo.system.parameter.SystemParameter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class SystemParameterServiceTest {

    @InjectMocks private SystemParameterService systemParameterService;
    @Mock private SystemParameterRepository systemParameterRepository;
    @Mock private QAMapper<SystemParameterEntity, SystemParameter> systemParameterQAMapper;

    @Test
    void getAll() {
        // given
        List<SystemParameter> systemParameters = new ArrayList<>();
        SystemParameter systemParameter = SystemParameter.builder()
                .id("123")
                .value("abc")
                .statusCode("ok")
                .build();
        systemParameters.add(systemParameter);

        // when
        Mockito.when(systemParameterQAMapper.map(ArgumentMatchers.anyList())).thenReturn(systemParameters);

        // then
        assertEquals(systemParameterService.getAll(), systemParameters);
    }
}