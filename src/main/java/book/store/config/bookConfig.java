package book.store.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource

;
@ComponentScan(basePackages="book.store.config")
@PropertySource("classpath:book.properties") 
public class bookConfig {

}
