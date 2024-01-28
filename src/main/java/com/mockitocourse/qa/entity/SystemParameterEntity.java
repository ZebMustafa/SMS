package com.mockitocourse.qa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "system_parameter")
public class SystemParameterEntity {
    @Id
    private String id;
    @Column
    private String statusCode;
    @Column(nullable = false)
    private String value;
}
