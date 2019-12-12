package bookstore;

public class Main {
    public static void main(String[] args) {
        User user = new User("Paweł","Cwik","32131212");
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();
        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);
        BookConnector connector = new BookConnector(user,apiAdapter);
        connector.checkAvailability("Harry Potter i Zakon Feniksa");
    }
}