package bookstore;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
public class User {
    @Getter
    private String name;
    @Getter
    private String surname;
    @Getter
    private String pesel;
    @Getter
    LocalDate dateOfBirth;

    public User(String name, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
    }
}
