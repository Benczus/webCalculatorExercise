package web.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class TSPWebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {


        System.out.println("cica");
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

        ctx.register(CalculatorApplicationContext.class);
        ctx.setServletContext(servletContext);

        ServletRegistration.Dynamic servletRegistration= servletContext.addServlet("dispatcherServer", new DispatcherServlet(ctx));

        servletRegistration.setLoadOnStartup(0);
        servletRegistration.addMapping("/");

    }
}
