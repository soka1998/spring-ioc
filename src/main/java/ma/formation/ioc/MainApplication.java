package ma.formation.ioc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ma.formation.ioc")
public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}