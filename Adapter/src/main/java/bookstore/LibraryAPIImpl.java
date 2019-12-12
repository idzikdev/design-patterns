package bookstore;

import java.time.LocalDate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LibraryAPIImpl implements LibraryAPI {
    Logger logger = LogManager.getLogger();
    public boolean isAvailable(String bookTitle) {
        logger.info("Sprawdzam dostepnosc " + bookTitle);
        return true;
    }

    public LocalDate dueDate(String bookTitle, String pesel) {
        logger.info("Sprawdzam date zwrotu dla " + bookTitle);
        return LocalDate.now();
    }

    public boolean reserve(String bookTitle, String pesel) {
        logger.info("Rezerwuje " + bookTitle);
        return true;
    }
}