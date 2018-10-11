package hu.iit.me;

import hu.iit.me.service.Calculator;

public class CalculatorController {

    private Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }

    public double add(double a, double b){
        double result;
        return result=calculator.add(a,b);
    }


}
