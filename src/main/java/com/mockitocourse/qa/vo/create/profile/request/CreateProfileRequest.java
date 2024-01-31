package com.mockitocourse.qa.vo.create.profile.request;

import com.mockitocourse.qa.vo.validation.ValidateChildDOB;
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
    // custom annotation
    @ValidateChildDOB // you can write overwrite your own message
    private Date childDOB;
}
