package org.schhx.relearnspring;

import org.schhx.relearnspring.beans.HelloWorld;
import org.schhx.relearnspring.beans.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * 基于 xml 配置
 *
 * @author shanchao
 * @date 2019-12-07
 */
public class BeanFactoryDemo {

    public static void main(String[] args) {
        // 读取配置文件
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
        reader.loadBeanDefinitions(new ClassPathResource("spring.xml"));

        // 获取 Bean
        beanFactory.getBean(UserService.class).save();
        beanFactory.getBean(HelloWorld.class).hello("spring");
    }
}
