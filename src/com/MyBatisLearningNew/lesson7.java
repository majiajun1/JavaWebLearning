package com.MyBatisLearningNew;

import com.MyBatisLearningNew.mapper.TestMapper;
import org.apache.ibatis.session.SqlSession;

public class lesson7 {
    public static void main(String[] args) throws InterruptedException {
    try (SqlSession sqlSession = MybatisUtil.getSession(true)){
        TestMapper testMapper = sqlSession.getMapper(TestMapper.class);
        while (true){
            Thread.sleep(100);
            System.out.println(testMapper.getStudentById(2));
        }

    }
}
}
