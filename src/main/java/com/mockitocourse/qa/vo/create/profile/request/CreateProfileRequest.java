package com.mockitocourse.qa.vo.create.profile.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class CreateProfileRequest {
    @NotBlank(message = "Name should not be blanked")
    private String name;
    @NotNull(message = "Age should not be null")
    private Integer age;
    @NotNull(message = "Child DOB should not be null")
    private Date childDOB;
}
