import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"SpringDemo.xml");
		Object book = classPathXmlApplicationContext.getBean("book1");
		// Object book1 = classPathXmlApplicationContext.getBean("book_bean_const");
		Object book2 = classPathXmlApplicationContext.getBean("book");
		Object book3 = classPathXmlApplicationContext.getBean("bookMixed");
		Object book4 = classPathXmlApplicationContext.getBean("author");


		System.out.println(book);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(book4);
	}
}
