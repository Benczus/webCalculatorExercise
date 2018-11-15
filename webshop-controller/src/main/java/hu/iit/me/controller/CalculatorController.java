package hu.iit.me.controller;

import hu.iit.me.service.Calculator;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/calc")
public class   CalculatorController {

    private Calculator calculator;

    public CalculatorController(Calculator calculator) {
        this.calculator = calculator;
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public String add(@RequestParam(value = "a") double a, @RequestParam(value = "b") double b) throws IllegalArgumentException{
        return String.valueOf(calculator.add(a,b));
    }

    @ResponseStatus(value = HttpStatus.I_AM_A_TEAPOT, reason = "Argument is illegal, I am a teapot!")
    @ExceptionHandler(IllegalArgumentException.class)
    public void illegalArgumentExceptionHandler(){
        //TODO
    }


}
