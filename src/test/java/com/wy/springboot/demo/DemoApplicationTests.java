package com.wy.springboot.demo;

import com.wy.springboot.demo.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {
    @Autowired
    ApplicationContext ioc;

    @Autowired
    Person person;
    @Test
    void contextLoads() {
        System.out.println(person);
    }
    @Test
    void testIoc(){
        System.out.println(ioc.containsBean("helloService02"));
    }

}
