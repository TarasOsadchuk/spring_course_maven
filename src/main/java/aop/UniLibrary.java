package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("Ми беремо книгу з UniLibrary ");
        System.out.println("_______________________________________");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("Ми повертаємо книгу в UniLibrary");
        return "11/22/63";
    }

    public void getMagazine() {
        System.out.println("Ми беремо журнал з UniLibrary");
        System.out.println("_______________________________________");

    }

    public void returnMagazine() {
        System.out.println("Ми повертаємо журнал в UniLibrary");
        System.out.println("_______________________________________");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Ми додаємо книгу в UniLibrary ");
        System.out.println("_______________________________________");
    }

    public void addMagazine() {
        System.out.println("Ми додаємо журнал в UniLibrary");
        System.out.println("_______________________________________");
    }
}
