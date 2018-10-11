package web.config;

import hu.iit.me.CalculatorController;
import hu.iit.me.service.BasicCalculator;
import hu.iit.me.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorApplicationContext {

    private final Calculator calculator;

    @Autowired
    public CalculatorApplicationContext(Calculator calculator) {
        this.calculator = calculator;
    }

    @Bean
    public CalculatorController calculatorController(){
        return new CalculatorController(calculator);
    }






}
