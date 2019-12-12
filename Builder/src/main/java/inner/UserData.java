package inner;

public class UserData {
    private String name;
    private String surname;
    private int age;

    private UserData(UserDataBuilder userDataBuilder) {
        this.name = userDataBuilder.name;
        this.surname = userDataBuilder.surname;
        this.age = userDataBuilder.age;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static class UserDataBuilder {
        private String name;
        private String surname;
        private int age;

        public UserDataBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public UserDataBuilder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserDataBuilder buildAge(int age) {
            this.age = age;
            return this;
        }

        public UserData build() {
            return new UserData(this);
        }
    }
}