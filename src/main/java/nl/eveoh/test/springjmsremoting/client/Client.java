package nl.eveoh.test.springjmsremoting.client;

import nl.eveoh.test.springjmsremoting.CheckingAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "nl/eveoh/test/springjmsremoting/jms.xml",
                "nl/eveoh/test/springjmsremoting/client/client.xml"
        );

        CheckingAccountService service = (CheckingAccountService) ctx.getBean("checkingAccountService");
        service.cancelAccount((long) 10);
    }

}
