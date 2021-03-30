package com.ex01.module.student.utils.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public class PageResult<T> {

    private List<T> content;
    private long timeTaken;
    private long pageCurrent;
    private long size;

}
