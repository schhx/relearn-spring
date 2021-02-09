package org.schhx.relearnspring;

import org.schhx.relearnspring.beans.HelloWorld;
import org.schhx.relearnspring.beans.UserDao;
import org.schhx.relearnspring.beans.UserService;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author shanchao
 * @date 2019-12-07
 */
public class Test2 {

    public static void main(String[] args) {
        GenericApplicationContext context = new GenericApplicationContext();
        context.registerBean("userDao", UserDao.class);
        context.registerBean("userService", UserService.class, context.getBean("userDao"));


        new XmlBeanDefinitionReader(context).loadBeanDefinitions("spring.xml");
        context.refresh();

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.hello("spring");

    }
}
