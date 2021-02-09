package org.schhx.relearnspring;

import org.schhx.relearnspring.beans.HelloWorld;
import org.schhx.relearnspring.beans.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于 xml 配置文件构建 ApplicationContext
 * @author shanchao
 * @date 2019-12-07
 */
public class ApplicationContextDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.getBean(UserService.class).save();
        context.getBean(HelloWorld.class).hello("spring");
    }
}
