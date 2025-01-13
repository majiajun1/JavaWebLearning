package com.MyBatisLearning.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
//@Alias("test")
@Accessors(chain = true)

public class Student {
//    public Student(int sid)
//    {
//        System.out.println("调用了");
//    }
//    public Student(int xxx,String yyy,String zzz){
//        System.out.println("调用了2");
//    }

//    public Student()
//    {
//        System.out.println("我被构造了");
//    }
    int sid;
    String name;
    String sex;
}
