package hu.iit.me.service;

import javax.servlet.http.HttpServlet;

public class BasicCalculator  implements CalculatorInterface {
    @Override
    public double add(double a, double b) {
        return a+b;
    }

    @Override
    public double substract(double a, double b) {
        return a-b;
    }

    @Override
    public double multiply(double a, double b) {
        return a*b;
    }

    @Override
    public double divide(double a, double b) {
         if(b!=0)
            return a/b;
      else throw new ArithmeticException();
    }
}
