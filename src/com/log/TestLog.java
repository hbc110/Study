package com.log;

import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class TestLog {
    public static void main(String[] args) throws IOException{
        Logger log = Logger.getLogger("testlog");
        log.setLevel(Level.ALL);
        // 获取当前用户工作目录
        String path = System.getProperty("user.dir");
        FileHandler fileHandler = new FileHandler("testlog.log");
        fileHandler.setLevel(Level.ALL);
        fileHandler.setFormatter(new LogFormatter());
        log.addHandler(fileHandler);
        log.info("This is test java util log");
    }
}

class LogFormatter extends Formatter {

    /**
     * Format the given log record and return the formatted string.
     * <p>
     * The resulting formatted String will normally include a
     * localized and formatted version of the LogRecord's message field.
     * It is recommended to use the {@link Formatter#formatMessage}
     * convenience method to localize and format the message field.
     *
     * @param record the log record to be formatted.
     * @return the formatted log record
     */
    @Override
    public String format(LogRecord record) {
        Date date = new Date();
        String sDate = date.toString();
        return "[" + sDate + "]" + "[" + record.getLevel() + "]"
                + record.getClass() + record.getMessage() + "\n";
    }
}
