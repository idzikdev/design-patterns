package bookstore;

import java.time.LocalDate;

public class BookConnector {
    private final User user;
    private final LibraryAPI api;

    public BookConnector(User user, LibraryAPI api) {
        this.user = user;
        this.api = api;
    }

    public boolean checkAvailability(String title) {
        return api.isAvailable(title);
    }

    public boolean reserve(String title, User user) {
        return api.reserve(title, user.getPesel());
    }

    public LocalDate whenToReturn(String title, User user) {
        return api.dueDate(title, user.getPesel());
    }
}