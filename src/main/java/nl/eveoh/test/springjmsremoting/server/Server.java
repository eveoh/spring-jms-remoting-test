package nl.eveoh.test.springjmsremoting.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Server {

    public static void main(String[] args) throws Exception {
        new ClassPathXmlApplicationContext(
                "nl/eveoh/test/springjmsremoting/jms.xml",
                "nl/eveoh/test/springjmsremoting/server/broker.xml",
                "nl/eveoh/test/springjmsremoting/server/server.xml"
        );
    }

}
