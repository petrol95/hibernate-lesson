import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Book.class)
                .addAnnotatedClass(Author.class)
                .addAnnotatedClass(Reader.class)
                .buildSessionFactory();

        Session session = null;
        try {

            // Добавить книгу
//            session = factory.getCurrentSession();
//            Book tmpBook = new Book("Harry Potter");
//            session.beginTransaction();
//            session.save(tmpBook);
//            session.getTransaction().commit();

            // Получить книгу
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Book harryPotter2 = session.get(Book.class, 2);
//            session.getTransaction().commit();
//            System.out.println(harryPotter2);

            // Обновить книгу
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Book harryPotter3 = session.get(Book.class, 3);
//            harryPotter3.setTitle("Harry Potter 3 Updated");
//            session.getTransaction().commit();
//            System.out.println(harryPotter3);

            // Удалить книгу
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Book trashBook = session.get(Book.class, 4);
//            session.delete(trashBook);
//            session.getTransaction().commit();

            // Получить список всех книг
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            List<Book> allBooks = session.createQuery("FROM Book").getResultList();
//            System.out.println(allBooks);
//            // from Book b where b.title='Harry Potter' OR b.authorName='Rowling'
//            //     OR b.title LIKE 'Harry%'
//            session.getTransaction().commit();

            // Массовое обновление
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            session.createQuery("update Book set title='A';").executeUpdate();
//            session.createQuery("delete from Book where id=50").executeUpdate();
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Book book = session.get(Book.class, 1);
//            session.delete(book);
//            System.out.println(book);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Author author = session.get(Author.class, 1);
//            System.out.println(author);
//            System.out.println(author.getBooks());
//            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            Book book = session.get(Book.class, 1);
            System.out.println(book.getReaders());
            System.out.println(book.getReaders().get(0).getBooks());
            session.getTransaction().commit();

        } finally {
            factory.close();
            session.close();
        }
    }
}
