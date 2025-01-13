package com.MyBatisLearningNew.mapper;

import com.MyBatisLearningNew.entity.Student;
import com.MyBatisLearningNew.entity.Teacher;

import java.util.List;

public interface TestMapper {

    List<Student> selectStudent();
    Student getStudentById(int sid);
    List<Student> findStudentsByIds(List<Integer> ids);
    int addStudent(Student student);
    int deleteStudent(int sid);
    Teacher getTeacherByTid(int tid);




}
