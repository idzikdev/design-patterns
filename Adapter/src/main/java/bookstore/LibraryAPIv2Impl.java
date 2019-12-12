package bookstore;

import java.time.LocalDate;

public class LibraryAPIv2Impl implements LibraryAPIv2 {
    @Override
    public int numberOfAvailableCopies(String bookTitle) {
        System.out.println("Sprawdzam dostepnosc " + bookTitle);
        return 3;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        System.out.println("Sprawdzam date zwrotu dla " + bookTitle);
        return LocalDate.now();
    }

    @Override
    public boolean reserve(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        System.out.println("Rezerwuje " + bookTitle);
        return true;
    }
}
