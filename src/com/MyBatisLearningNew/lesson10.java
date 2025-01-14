package com.MyBatisLearningNew;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

public class lesson10 {
    public static void main(String[] args) throws IOException {
        Logger log = Logger.getLogger(lesson10.class.getName());

//        log.log(Level.SEVERE,"严重错误演示");
////        log.info("Hello World");
//        log.log(Level.WARNING,"warning信息演示");
//        log.log(Level.INFO,"INFO级别信息演示");
//        log.log(Level.CONFIG,"CONFIG级别信息演示");
//        log.info("=========================");
//==========================================================
//        log.setLevel(Level.CONFIG);
//        log.setUseParentHandlers(false);
//        ConsoleHandler ch = new ConsoleHandler();
//        ch.setLevel(Level.CONFIG);
//        log.addHandler(ch);
//
//        log.log(Level.SEVERE,"严重错误演示");
////        log.info("Hello World");
//        log.log(Level.WARNING,"warning信息演示");
//        log.log(Level.INFO,"INFO级别信息演示");
//        log.log(Level.CONFIG,"CONFIG级别信息演示");
//        System.out.println(log.getParent().getClass());
        //====================================

//
//        log.setLevel(Level.CONFIG);
//        log.setUseParentHandlers(false);
//        FileHandler fh = new FileHandler("test.log",true); //true则追加
//        fh.setLevel(Level.ALL);
//        fh.setFormatter(new SimpleFormatter()); //设置格式
//        log.addHandler(fh);
//        ConsoleHandler ch = new ConsoleHandler();
//        ch.setLevel(Level.CONFIG);
//        ch.setFormatter(new XMLFormatter());
//        log.addHandler(ch);
//
//        log.log(Level.SEVERE,"严重错误演示");
//        log.log(Level.WARNING,"warning信息演示");
//        log.log(Level.INFO,"INFO级别信息演示");
//        log.log(Level.CONFIG,"CONFIG级别信息演示");


        //======================================================
        log.setLevel(Level.CONFIG);
        log.setUseParentHandlers(false);

         ConsoleHandler handler = new ConsoleHandler(){{setOutputStream(System.out);}};
        handler.setFormatter(new Formatter() {
        @Override
        public String format(LogRecord record) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            String time = format.format(new Date(record.getMillis()));  //格式化日志时间
            String level = record.getLevel().getName();  // 获取日志级别名称
            // String level = record.getLevel().getLocalizedName();   // 获取本地化名称（语言跟随系统）
            String thread = String.format("%10s", Thread.currentThread().getName());  //线程名称（做了格式化处理，留出10格空间）
            long threadID = record.getThreadID();   //线程ID
            String className = String.format("%-20s", record.getSourceClassName());  //发送日志的类名
            String msg = record.getMessage();   //日志消息

          //\033[33m作为颜色代码，30~37都有对应的颜色，38是没有颜色，IDEA能显示，但是某些地方可能不支持
            return "\033[38m" + time + "  \033[33m" + level + " \033[35m" + threadID
                    + "\033[38m --- [" + thread + "] \033[36m" + className + "\033[38m : " + msg + "\n";
        }
    });


        FileHandler fh = new FileHandler("test.log",true); //true则追加
        fh.setLevel(Level.ALL);
        fh.setFormatter(new SimpleFormatter()); //设置格式
        log.addHandler(fh);

        handler.setLevel(Level.CONFIG);
        log.addHandler(handler);

        log.log(Level.SEVERE,"严重错误演示");
        log.log(Level.WARNING,"warning信息演示");
        log.log(Level.INFO,"INFO级别信息演示");
        log.log(Level.CONFIG,"CONFIG级别信息演示");

    }
}
