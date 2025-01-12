package com.MyBatisLearning.mapper;

import com.MyBatisLearning.entity.Student;

import java.util.List;
import java.util.Map;

public interface TestMapper {

    List<Student> selectStudent();
    Student getStudentById(int sid);
    int addStudent(Student student);
    int deleteStudent(int sid);
}
