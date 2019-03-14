package com.mjc.voice.thread.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by gcb on 2019/2/15.
 */
public class NameList {
    private List nameList = Collections.synchronizedList(new LinkedList());

    public void add(String name) {
        nameList.add(name);
    }

    public String removeFirst() {
        if (nameList.size() > 0) {
            return (String) nameList.remove(0);
        } else {
            return null;
        }
    }

}
