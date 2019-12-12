package bookstore;

import java.time.LocalDate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LibraryAPIv2Impl implements LibraryAPIv2 {
    Logger logger = LogManager.getLogger();
    @Override
    public int numberOfAvailableCopies(String bookTitle) {
        logger.info("Sprawdzam dostepnosc " + bookTitle);
        return 3;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        logger.info("Sprawdzam date zwrotu dla " + bookTitle);
        return LocalDate.now();
    }

    @Override
    public boolean reserve(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        logger.info("Rezerwuje " + bookTitle);
        return true;
    }
}