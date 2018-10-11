package web.config;

import hu.iit.me.CalculatorController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runnable {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(CalculatorApplicationContext.class, CalculatorApplicationMethodContext.class);
        CalculatorController controller= (CalculatorController) context.getBean("calculatorController");
        System.out.println(controller.add(5,3));
        System.out.println(context.getBean("helloWorld"));




    }

}
