package com.MyBatisLearningNew.test;

import com.MyBatisLearningNew.entity.Student;
import com.MyBatisLearningNew.mapper.TestMapper;
import com.MyBatisLearningNew.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Maintest {

       private SqlSessionFactory sqlSessionFactory;
    @Before
    public void before(){
        System.out.println("测试前置正在初始化...");
        try {
            sqlSessionFactory = new SqlSessionFactoryBuilder()
                    .build(new FileInputStream("D:\\Document\\JavaWebLearning\\src\\com\\MyBatisLearningNew\\mybatis-config.xml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("测试初始化完成，正在开始测试案例...");
    }










    @Test
    public void test() {
        System.out.println("测试用例1");
    }
    @Test
    public void test2(){
        System.out.println("测试用例2");
//        Assert.assertEquals(1,1);
    }
    @Test
    public void test3(){
          int[] arr = {0, 4, 5, 2, 6, 9, 3, 1, 7, 8};

    //错误的冒泡排序
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - 1 - i; j++) {
            if(arr[j] > arr[j + 1]){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                 arr[j+1] = tmp;
            }
        }
    }
    System.out.println(Arrays.toString(arr));
    Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
    }


    @Test
    public void test4(){
        try(SqlSession session= sqlSessionFactory.openSession(true))
        {
            TestMapper mapper = session.getMapper(TestMapper.class);
            System.out.println(mapper.getStudentBySid(1));
            Student student = mapper.getStudentBySid(1);
            Assert.assertEquals(new Student().setSid(1).setName("MJJ").setSex("female"),student);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @After
    public void after(){
        System.out.println("测试结束");
    }


}
