package cn.superhat.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhaojiachen on 2018/12/30.
 */
public class LogbackPrint {

    private static Logger logger = LoggerFactory.getLogger(LogbackPrint.class);
    public static void main(String[] args) {
        logger.info("sssssssssssssssssssss");
        System.out.println(1 / 0);
    }
}
