package org.schhx.relearnspring.beans;

import org.springframework.stereotype.Component;

/**
 * @author shanchao
 * @date 2019-12-07
 */
@Component
public class HelloWorld {

    public void hello(String name) {
        System.out.println("hello " + name);
    }
}
