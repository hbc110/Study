package com.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 1. 导入org.apache.commons.logging的jar包；
 * 2. 配置resources文件(commons-logging.properties)和(log4j.properties)；
 * 3. 配置resources路径。
 */
public class TestLogCom {
    static Log log = LogFactory.getLog(TestLog.class);
    public static void main(String[] args) {

        log.debug("Here is some DEBUG");
        log.info("Here is some INFO");
        log.warn("Here is some WARN");
        log.error("Here is some ERROR");
        log.fatal("Here is some FATAL");
    }

}