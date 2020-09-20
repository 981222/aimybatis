package com.huang.repository;

import com.huang.entity.Student;

public interface StudentRepository {
    public Student findById(long id);
    public Student findByIdLazy(long id);
}
