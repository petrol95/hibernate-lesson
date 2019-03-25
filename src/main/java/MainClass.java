import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Book.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();

            Book tmpBook = new Book("Harry Potter");
            session.beginTransaction();
            session.save(tmpBook);
            session.getTransaction().commit();

        } finally {
            factory.close();
            session.close();
        }
    }
}
