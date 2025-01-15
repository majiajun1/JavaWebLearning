package com.MyBatisLearningNew;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class lesson12 {
    public static void main(String[] args) throws IOException {
        LogManager manager = LogManager.getLogManager();
        manager.readConfiguration(new FileInputStream("D:\\Document\\JavaWebLearning\\src\\com\\MyBatisLearningNew\\test.properties"));

        Logger logger= Logger.getLogger(lesson12.class.getName());
        logger.log(Level.INFO,"你好");
    }
}
