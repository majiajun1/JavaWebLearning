package com.MyBatisLearning;

import com.MyBatisLearning.entity.Student;
import com.MyBatisLearning.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

public class Lesson6 {
   public static void main(String[] args) {
    try (SqlSession sqlSession = MybatisUtil.getSession(true)){
        TestMapper testMapper = sqlSession.getMapper(TestMapper.class);

        Student student2;
        try(SqlSession sqlSession2 = MybatisUtil.getSession(true)){
            TestMapper testMapper2 = sqlSession2.getMapper(TestMapper.class);
            student2 = testMapper2.getStudentById(1);
        }

        Student student1 = testMapper.getStudentById(1);
        System.out.println(student1 == student2);
    }
}
}
