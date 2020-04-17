package pe.isil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.isil.application.Gallery;

public class AppSpring {

    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("beans.xml");

        Gallery gallery = app.getBean("gallery", Gallery.class);

        gallery.shared();

    }

}
