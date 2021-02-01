package com.copyOnWrite;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnWriteTest {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<String>();
    }
}
