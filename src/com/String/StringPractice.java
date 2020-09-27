package com.String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 2017/07/09
 * 主要针对计算机组成原理课设中机器码后面的汇编注释进行清除，只保留机器码
 * 原码小数除法（复杂模型机实现）的报告要求只要机器码，注释和汇编都不要。原始文件内容如in.out：
 */
public class StringPractice {

    public static void main(String[] args) throws IOException,FileNotFoundException{
        // TODO Auto-generated method stub
        File file1 = new File("E:/workplace_asiaInfo/Study/src/com/String/in.txt");
        File file2 = new File("E:/workplace_asiaInfo/Study/src/com/String/out.txt");
        BufferedReader bReader;
        PrintWriter pWriter;
        String string;
        String[] aStrings = new String[10];
        bReader = new BufferedReader(new FileReader(file1));
        pWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2)));
        while((string = bReader.readLine())!=null){
            aStrings = string.split(";");
            if(aStrings[0].length()==0)//判断是否遇到空行
                break;
            //System.out.println(aStrings[0].length());
            //System.out.println(aStrings[0].charAt(1));
            pWriter.println(aStrings[0]);//写入首个字符串
        }
        bReader.close();
        pWriter.flush();
        pWriter.close();



    }

}