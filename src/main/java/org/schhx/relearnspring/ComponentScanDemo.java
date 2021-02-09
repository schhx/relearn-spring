package org.schhx.relearnspring;

import org.schhx.relearnspring.beans.HelloWorld;
import org.schhx.relearnspring.beans.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring 2.5 开始支持 component-scan
 *
 * @author shanchao
 * @date 2019-12-07
 */
public class ComponentScanDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("component-scan.xml");
        context.getBean(UserService.class).save();
        context.getBean(HelloWorld.class).hello("spring");
    }
}
