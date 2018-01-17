package org.dubbo.consumer;
import org.dubbo.api.Login;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        System.err.println(System.currentTimeMillis());
        Login demoService = context.getBean(Login.class);
        System.out.println("consumer");
        if (demoService.login("wang", "shenghu")){
            System.out.println("-----YES-----");
        }else{
            System.out.println("-----NO-----");
        }
        System.err.println(System.currentTimeMillis());
    }
}
