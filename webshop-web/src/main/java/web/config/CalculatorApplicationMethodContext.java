package web.config;


import hu.iit.me.service.BasicCalculator;
import hu.iit.me.service.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration


public class CalculatorApplicationMethodContext {

    @Bean
    public Calculator calculator(){
        return new BasicCalculator();
    }

    @Bean
    public String helloWorld(){
        return "hello world!";
    }

}
