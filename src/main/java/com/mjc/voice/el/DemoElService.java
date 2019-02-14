package com.mjc.voice.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by gcb on 2019/2/13.
 */
@Service
public class DemoElService {
    @Value("其他属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
