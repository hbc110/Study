package com.collection;

import java.util.ArrayList;

public class ArrayListSetAndAdd {
    public static void main(String[] args) {

        //创建一个动态数组
        ArrayList<String> sites = new ArrayList<String>();

        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        System.out.println("网站列表：" + sites);

        //索引 2 的元素被替换
        String element = sites.set(2, "Wiki");
        System.out.println("替换后：" + sites);
        System.out.println("被替换的元素：" + element);

        //创建另一个 sites2 动态数组
        ArrayList<String> sites2 = new ArrayList<String>();

        //将 sites 中的数组元素添加到 sites2
        sites2.addAll(sites);
        System.out.println("ArrayList：" + sites);

        //使用set()
        sites.set(1, "Wiki");
        System.out.println("ArrayList 使用 set() 后：" + sites);

        //使用 add()
        sites2.add(1, "Wiki");
        System.out.println("ArrayList 使用 add() 后：" + sites2);

    }
}
