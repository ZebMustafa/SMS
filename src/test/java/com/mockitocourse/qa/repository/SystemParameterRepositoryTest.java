package com.mockitocourse.qa.repository;

import com.mockitocourse.qa.entity.SystemParameterEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@DataJpaTest
class SystemParameterRepositoryTest {

    @Autowired
    private SystemParameterRepository underTest;

    @Test
    void findById() {
        // given
        SystemParameterEntity givenEntity = SystemParameterEntity.builder()
                .id("124")
                .value(getCountryFlagObject())
                .statusCode("A")
                .build();
        underTest.save(givenEntity);

        // when & then
        SystemParameterEntity entity = underTest.findById("124");

        log.info("The value in System parameter is : {}", entity.getValue());
        assertNotNull(entity);

    }

    private String getCountryFlagObject() {
        return "{\"Canada\": \"canada\",\"United Kingdom\": \"united-kingdom\",\"New Zeland\": \"new-zeland\",\"Singapore (Citizan)\": \"singapore\",\"Singapore (Forigner\": \"singapore\"}";
    }
}