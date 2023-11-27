package demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "demo")
@EnableAspectJAutoProxy // it will enable aspect classes
public class BeanConfig {
}

//this is a configuration file so we need to add a @Configuration annotation.
//add a @ComponentScan annotation and provide basePackage,
//so it will scan all the components in this base package
