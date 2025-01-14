package com.MyBatisLearningNew.mapper;

import com.MyBatisLearningNew.entity.Student;
import com.MyBatisLearningNew.entity.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface TestMapper {
    @Insert("insert into mybatislearning.student(name, sex) values (#{name},#{sex})")
        int addStudent(Student student);
    @Results({
            @Result(id=true, column = "sid",property = "sid"),
            @Result(column = "name",property = "name"),
            @Result(column = "sex",property = "sex")
    })
    @Select("select * from mybatislearning.student where sid=#{id}")
    Student getStudentBySid(int id);

//
//    @Results({
//            @Result(id = true, column = "tid",property = "tid"),
//            @Result(column = "name",property = "name"),
//            @Result(column = "tid",property = "studentList",
//                    many = @Many(select = "getStudentByTid"))
//    })
    @Select("select * from  mybatislearning.teacher where tid=#{id}")
    Teacher getTeacherByTid(int id);

            @Select("select * from mybatislearning.student inner join " +
                    "mybatislearning.teach on mybatislearning.student.sid=mybatislearning.teach.sid where tid=#{id}")
    List<Student> getStudentByTid(int id);

            @Select("select * from mybatislearning.student where name=#{name} and sex=#{sex}")
    List<Student> getStudentNameandSex(@Param("name")  String name,@Param("sex") String sex);
}
