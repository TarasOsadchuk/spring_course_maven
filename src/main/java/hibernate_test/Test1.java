package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).
                buildSessionFactory();

        try {
            Session session = factory.getCurrentSession(); // створюємо сесію
            Employee emp = new Employee(
                    "Aleksandr",
                    "Ivanov",
                    "IT",
                    600);
            session.beginTransaction(); // відкрили транзакцію
            session.save(emp); // додали працівника
            session.getTransaction().commit(); // закрили транзакцію
            System.out.println("Done!");
            System.out.println(emp);
        } finally {
            factory.close(); // обовязкково закриваємо сесію (краще у try/finally)
        }
    }
}
