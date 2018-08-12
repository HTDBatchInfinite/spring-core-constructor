package org.nit.upendra.spring.container;

import org.nit.upendra.spring.beans.Trade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {

	public static void main(String[] args) {
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/main/resources/spring.xml"));
		ApplicationContext factory=new ClassPathXmlApplicationContext("spring.xml");
		Trade trade1=(Trade)factory.getBean("trade1");
		int tardeid=trade1.getTradeid();
		String tradetype=trade1.getTradetype();
		System.out.println(tardeid+" "+tradetype);
		
		Trade trade2=(Trade)factory.getBean("trade2");
		int tamount=trade2.getTradeamount();
		String tpercen=trade2.getTradepercent();
		System.out.println(tamount+" "+tpercen);
		
	}

	
	
}
