package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component // this should be added because it should come under component scan
public class LoggingAspect {

    @Before("execution(* demo.Shoppingcart.checkout(..))")
    public void beforeLogger(JoinPoint jp){
        //get signature will return whole return type with pacakeg class and method
        System.out.println(jp.getSignature());
        //args will return all the arguments passed
        System.out.println("Before loggers witH Argumnet--->"+jp.getArgs()[0].toString());
        System.out.println("Logger");
    }
    //If we need anything to access we can do that by using JointPoint

    @After("execution(* *.*.checkout(..))")
    // 1st * any return type
    // 2nd * any package
    // 3rd * any class
    public void afterLogger(){
        System.out.println("After Logger");
    }

    @Pointcut("execution(* demo.ShoppingCart.quantity(..))")
    public void afterReturningPointCut(){

    }

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning :"+retVal);
    }

    //The method call will fail if there are any changes in number of paramters
    //so we need to add (..) this will handle the n number of paramaters
}

//this is a point cut
//what we have to run this before or after or whatever
//and call other methods with before and called join cut