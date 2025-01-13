package com.MyBatisLearning.mapper;

import com.MyBatisLearning.entity.Student;
import com.MyBatisLearning.entity.Teacher;

import java.util.List;
import java.util.Map;

public interface TestMapper {

    List<Student> selectStudent();
    Student getStudentById(int sid);
    List<Student> findStudentsByIds(List<Integer> ids);
    int addStudent(Student student);
    int deleteStudent(int sid);
    Teacher getTeacherByTid(int tid);


}
