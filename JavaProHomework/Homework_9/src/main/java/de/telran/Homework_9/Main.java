package de.telran.Homework_9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Order order = (Order) context.getBean("order1");
        System.out.println(order);

        PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
        paymentGateway.printInfo();
    }
}
