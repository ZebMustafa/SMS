package com.mockitocourse.qa.mapper;

import java.util.List;

public interface QAMapper<T, U> {
    U map(T sourceObject);

    List<U> map(List<T> sourceObjectList);
}
