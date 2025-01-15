package com.MyBatisLearningNew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class lesson11 {
    public static void main(String[] args) throws IOException {
//        Properties prop = new Properties();
//        prop.load(new FileInputStream("D:\\Document\\JavaWebLearning\\src\\com\\MyBatisLearningNew\\test.properties"));
//        System.out.println(prop.getProperty("namex", "xxxx"));
//        prop.put("namex", "xxxx");//hashtable 不能插入null值 但是hashmap可以
//        System.out.println(prop);
//        prop.store(System.out, "我是测试");
        System.getProperties().store(System.out, "系统信息");
    }
}
