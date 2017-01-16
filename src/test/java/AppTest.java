import com.mycompany.hibernate_postgresql_maven.entity.AppUser;

import junit.framework.TestCase;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppTest extends TestCase {
    
    public void testApp() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();        
        Session session = sessionFactory.openSession();
        
        session.beginTransaction();
        
        AppUser appUser = new AppUser("Мироненко Виктор");
        session.save(appUser);
        
        session.getTransaction().commit();
        session.close();
    }
}
