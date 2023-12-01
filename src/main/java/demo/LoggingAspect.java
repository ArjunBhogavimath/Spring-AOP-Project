package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component // this should be added because it should come under component scan
public class LoggingAspect {

    @Before("execution(* demo.Shoppingcart.checkout(..))")
    public void beforeLogger(){
        System.out.println("Logger");
    }
    @After("execution(* *.*.checkout(..))")
    // 1st * any return type
    // 2nd * any package
    // 3rd * any class
    public void afterLogger(){
        System.out.println("After Logger");
    }

    //The method call will fail if there are any changes in number of paramters
    // so we need to add (..) this will handle the n number of paramaters
}

//this is a point cut
//what we have to run this before or after or whatever
//and call other methods with before and called join cut