package bookstore;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AdapterTest extends BaseTest {

    @Test
    public void adapter_test() {
        User user = new User("Paweł", "Cwik", "32131212");
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();
        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);
        BookConnector connector = new BookConnector(user, apiAdapter);
        assertThat(connector.checkAvailability("Title")).isEqualTo(true);
    }
}
