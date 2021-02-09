package org.schhx.relearnspring;

import org.schhx.relearnspring.beans.HelloWorld;
import org.schhx.relearnspring.beans.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author shanchao
 * @date 2019-12-07
 */
public class AnnotationConfigApplicationContextDemo {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.schhx.relearnspring");
        context.getBean(UserService.class).save();
        context.getBean(HelloWorld.class).hello("spring");
    }
}
