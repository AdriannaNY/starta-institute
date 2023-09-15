package de.telran.Homework_9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class PaymentGateway {

    @Autowired   // set bean into this field - developer
    @Qualifier("order2")   // exactly this bean (we have 2 beans of class Developer in context)
    private Order order;
    public void printInfo() {
        System.out.println(order);
    }

}
