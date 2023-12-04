package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(demo..*)")
    public void authenticationPointCut(){

    }

    @Pointcut("within(demo..*)")
    public void authorizationPointCut(){

    }

    //we need to call the above 2 pointCuts so created this method
    //using @before we can call authenticate method before the mentioned pointcut methods
    @Before("authenticationPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("Authenticating the Request!!!");
    }
}

//Pointcuts will run when within the class method calls
//(demo..*) means inside demo package all the classes will come
//2nd pointCut will call the classes as well including shoppingCart
