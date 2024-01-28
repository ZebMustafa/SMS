package com.mockitocourse.qa.vo.system.parameter;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SystemParameter {
    private String id;
    private String statusCode;
    private String value;
}
