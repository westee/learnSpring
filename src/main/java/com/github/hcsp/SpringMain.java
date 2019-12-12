package com.github.hcsp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        // Spring 的核心接口
        BeanFactory bean = new ClassPathXmlApplicationContext("classpath:config.xml");

//        OrderDao orderDao = (OrderDao) bean.getBean("orderDao");
        OrderService orderService = (OrderService) bean.getBean("orderService");
        orderService.doSomething();
    }
}
/**
 * 控制反转 IoC Inverse of Control
 * 将控制权交给容器。将各种依赖关系声明好，其关联过程由程序来进行。
 *
 * 依赖注入 Dependency Injection
 * 容器负责注入所有的依赖，依赖虽被声明，但是值是null,spring容器将所有依赖赋值就是di。
 * 通过注解来实现依赖比通过<bean>xxxx</bean>更好。如何注入是spring容器决定的。
 */
