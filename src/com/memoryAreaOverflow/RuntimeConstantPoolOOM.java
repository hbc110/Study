package com.memoryAreaOverflow;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时常量池溢出
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 * java 8中被废除了以上VM参数写法
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        // 使用List保持着常量池引用,避免Full GC回收常量池行为
        List<String> list = new ArrayList<String>();
        // 10MB的 PermSize 在 integer 范围内足够产生OOM了
        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }

}
