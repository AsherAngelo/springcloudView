package com.springcloud.session1event.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringEventListenerDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.addApplicationListener(new MyApplicationListener());
        //将MyApplicationListener类打上@Compance注解然后context.register(new MyApplicationListener())也是可以的
        //如果放在这进行事件声明会报错的
        context.refresh();
        context.publishEvent(new MyApplicationEvent("hello word"));
    }

    public static class MyApplicationEvent extends ApplicationEvent {

        public MyApplicationEvent(Object source) {
            super(source);
        }
        public String strr(){
            return "我是事件监听器中的消息";
        }
    }

    public static class MyApplicationListener implements ApplicationListener<MyApplicationEvent>{

        @Override
        public void onApplicationEvent(MyApplicationEvent myApplicationEvent) {
            System.out.println(myApplicationEvent.getSource());
            System.out.println(myApplicationEvent.strr());
        }
    }
}

