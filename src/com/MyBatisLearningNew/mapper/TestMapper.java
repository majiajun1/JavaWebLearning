package com.MyBatisLearningNew.mapper;

import com.MyBatisLearningNew.entity.Student;
import com.MyBatisLearningNew.entity.Teacher;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestMapper {
    @Insert("insert into mybatislearning.student(name, sex) values (#{name},#{sex})")
        int addStudent(Student student);
    @Results({
            @Result
    })
    @Select("select * from mybatislearning.student where sid=#{id}")
    Student getStudentBySid(int id);



}
