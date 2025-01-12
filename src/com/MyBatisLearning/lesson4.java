package com.MyBatisLearning;

import com.MyBatisLearning.entity.Student;
import com.MyBatisLearning.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class lesson4 {
    public static void main(String[] args) {
        try(SqlSession session=MybatisUtil.getSession(true))
        {
//            List<Student> selectStudent = session.selectList("selectStudent");
//            for (Student student : selectStudent)
//            {
//                System.ou
//                t.println(student);
//            }
            TestMapper mapper = session.getMapper(TestMapper.class);
//            mapper.selectStudent().forEach(System.out::println);
////            System.out.println(mapper.getClass());
//            System.out.println("=======");
//
//            Student one=new Student().setSid(1).setName("MJJ4").setSex("male");
//            System.out.println(mapper.addStudent(one));
            System.out.println(mapper.deleteStudent(7));

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
