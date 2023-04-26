package org.stackroute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.stackroute.domain.Cab;
import org.stackroute.domain.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Product product = (Product) applicationContext.getBean("product1");
        System.out.println(product);
        product = (Product) applicationContext.getBean("product2");
        System.out.println(product);

        Cab cab1 = (Cab) applicationContext.getBean("cab1");
        System.out.println(cab1);
        Cab cab2 = (Cab) applicationContext.getBean("cab1");
        cab2.setCabId(35);
        System.out.println(cab1);
        System.out.println(cab2);
    }
}
