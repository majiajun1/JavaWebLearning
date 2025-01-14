package com.MyBatisLearningNew;

import com.MyBatisLearningNew.entity.Student;
import com.MyBatisLearningNew.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

public class lesson8 {
    public static void main(String[] args) {
         try(SqlSession sqlSession=MybatisUtil.getSession(true))
         {
             TestMapper mapper=sqlSession.getMapper(TestMapper.class);
//             mapper.addStudent(new Student().setSex("male").setName("MJJ5"));
//             System.out.println(mapper.getTeacherByTid(1));
             System.out.println(mapper.getStudentNameandSex("MJJ5","male"));
         }
    }


}
