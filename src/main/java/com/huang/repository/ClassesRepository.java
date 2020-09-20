package com.huang.repository;

import com.huang.entity.Classes;

public interface ClassesRepository {
    public Classes findById(long id);
    public Classes findByIdLazy(long id);
}
