package web.config;

import hu.iit.me.service.BasicCalculator;
import hu.iit.me.service.CalculatorInterface;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DivisionServlet extends HttpServlet {

    CalculatorInterface calculator;

    @Override
    public void init() throws ServletException {
        calculator= new BasicCalculator();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(req.getParameter("a"));
        System.out.println(req.getParameter("b"));

        double a= Double.parseDouble(req.getParameter("a"));
        double b= Double.parseDouble(req.getParameter("b"));
        resp.setStatus(200);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
        PrintWriter writer= resp.getWriter();


        writer.println(calculator.divide(a,b));
        writer.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
