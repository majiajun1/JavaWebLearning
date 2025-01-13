package com.MyBatisLearningNew;

import com.MyBatisLearning.entity.Student;
import lombok.SneakyThrows;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.util.List;

public class lesson3 {
    @SneakyThrows
    public static void main(String[] args) {
        String resource = "D:\\Document\\JavaWebLearning\\src\\com\\MyBatisLearning\\mybatis-config.xml";
//    InputStream inputStream = Resources.getResourceAsStream(resource);
//    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(new FileInputStream(resource));

        try (SqlSession session = sqlSessionFactory.openSession(true);)  //自动提交打开
        {
            System.out.println("正常运行，这里是业务");
            List<Student> selectStudent = session.selectList("selectStudent");
            for (Student student : selectStudent)
            {
                System.out.println(student);
            }



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
