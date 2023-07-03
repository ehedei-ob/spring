package dev.ehedei;

import dev.ehedei.services.GrettingsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(final String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        final GrettingsService grettingsService = (GrettingsService) context.getBean("greetingsService");
        grettingsService.printGreetings();
    }
}