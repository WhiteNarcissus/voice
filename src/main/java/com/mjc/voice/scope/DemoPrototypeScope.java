package com.mjc.voice.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by gcb on 2019/2/13.
 */
@Service
@Scope("prototype")
public class DemoPrototypeScope {
}
