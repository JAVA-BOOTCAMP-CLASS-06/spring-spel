package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Author;
import beans.DBBean;
import beans.Numeric;
import beans.Sample;
import spring.AppConfig;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();

		Author author = (Author)ac.getBean("author");
		
		author.show();

		Numeric numeric = (Numeric)ac.getBean("numeric");
		
		System.out.println(numeric.getValue1() + " + " + numeric.getValue2() + " = " + numeric.getSuma());
		
		DBBean db = ac.getBean(DBBean.class);
		System.out.println(db.getUrl());
		System.out.println(db.getUser());
		System.out.println(db.getPassword());
		
		Sample s = ac.getBean(Sample.class);
		System.out.println(s.getVersion());
		
		s.getlStr().forEach(System.out::println);
		
		ac.close();
	}

}
