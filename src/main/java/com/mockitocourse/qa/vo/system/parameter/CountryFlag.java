package com.mockitocourse.qa.vo.system.parameter;

import lombok.Builder;
import lombok.Data;

import java.util.Map;
@Builder
@Data
public class CountryFlag {
    Map<String, Object> values;
}
