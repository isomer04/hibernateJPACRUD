package com.isomer.cruddemo.dao;

import com.isomer.cruddemo.entity.Student;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);

}
