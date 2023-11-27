package demo;

import org.springframework.stereotype.Component;

@Component
public class Shoppingcart {
    public void checkout(){
        //multiple aspects will be there
        //logger
        //authentication & authorization
        System.out.println("Checkout method for shopping cart class");
    }
}


//we need to create a bean for this class first so we need to add @component annotation .
// after we can go with xml based configuration or annotation based configuration.
// we will work with annotation based configuration
// so for that we need to create a configuration file. and call it as BeanConfig.java