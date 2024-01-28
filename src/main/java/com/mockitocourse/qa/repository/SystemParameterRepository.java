package com.mockitocourse.qa.repository;

import com.mockitocourse.qa.entity.SystemParameterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemParameterRepository extends JpaRepository<SystemParameterEntity, Long> {
    SystemParameterEntity findById(String id);
}
