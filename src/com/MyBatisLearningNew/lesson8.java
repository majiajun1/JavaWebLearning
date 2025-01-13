package com.MyBatisLearningNew;

import com.MyBatisLearning.entity.Student;
import com.MyBatisLearning.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

public class lesson8 {
    public static void main(String[] args) {
         try(SqlSession sqlSession=MybatisUtil.getSession(true))
         {
             TestMapper mapper=sqlSession.getMapper(TestMapper.class);
             mapper.addStudent(new Student().setSex("male").setName("MJJ5"));
             System.out.println(mapper.getStudentById(2));
         }
    }


}
