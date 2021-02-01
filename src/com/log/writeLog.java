package com.log;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class writeLog {
    /**
     * @param path 保存日志文件路径
     * @param content 日志内容
     */
    public static void writeFile(String path, String content){
        File writeFile;
        try{
            // 通过这个对象来判断是否向文本我呢见中追加内容
            // boolean addStr = append;
            writeFile = new File(path);

            // 如果文本文件不存在则创建它
            if (!writeFile.exists()){
                writeFile.createNewFile();
                writeFile = new File(path); // 重新实例化
            }

            FileOutputStream fw = new FileOutputStream(writeFile,true);
            Writer out = new OutputStreamWriter(fw, "utf-8");
            out.write(content);
            String newline = System.getProperty("line.separator");
            // 写入换行
            out.write(newline);
            out.close();
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    // 获取当前时间
    public static String getCurrentYYYYMMDDHHMMSS(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        formatter.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        Date currTime = new Date();
        String thisTime = new String(formatter.format(currTime));
        return thisTime;
    }

    public static void main(String[] args){
        String path = System.getProperty("user.dir") + "\\src\\com\\log\\001.log";
        String logpath = path.replace("\\","/");
        String content = writeLog.getCurrentYYYYMMDDHHMMSS() + "日志处理开始";
        writeFile(logpath,content);
        content = writeLog.getCurrentYYYYMMDDHHMMSS() + "生成的.txt的路径为:";
        writeFile(logpath,content);
        writeFile(logpath,"a.txt");
        writeFile(logpath,"d.txt");
    }
}
