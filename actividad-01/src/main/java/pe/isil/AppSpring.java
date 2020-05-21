package pe.isil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.isil.equipo.futbol.Barcelona;

public class AppSpring {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");

        Barcelona barcelona = app.getBean("barcelona", Barcelona.class);

        barcelona.team();
    }
}
