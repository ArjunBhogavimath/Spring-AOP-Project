package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        //create a object of the shoppingcart class
        //context will have all the available beans
        //so inside getBean() we need to specify the calssname and .class,
        //by doing this we can get the bean of shopping cart class
        Shoppingcart cart = context.getBean(Shoppingcart.class);
        cart.checkout();
    }
}


//I can get the BeanConfig class here by ApplicationContext method
//we got the context now,
//from this context we can get the Beans