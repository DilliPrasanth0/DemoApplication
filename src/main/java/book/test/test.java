package book.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import book.store.config.bookConfig;


public class test {
	public static void main(String[] args) {
		ApplicationContext aa = new AnnotationConfigApplicationContext(bookConfig.class);
		Object babu = aa.getBean("con");
		System.out.println(babu);
		

	}

}
