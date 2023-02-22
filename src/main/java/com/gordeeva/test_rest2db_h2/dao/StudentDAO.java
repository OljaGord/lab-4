package com.gordeeva.test_rest2db_h2.dao;

import com.gordeeva.test_rest2db_h2.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO {
    List<Student> getAllStudents();
    Student saveStudent (Student student);
    Student getStudent (int id);
    void deleteStudent(int id);
}
