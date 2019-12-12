package inner;

public class Main {
    public static void main(String[] args) {
        UserData userData = new UserData.UserDataBuilder()
                .buildName("Tom")
                .buildSurname("Idzik")
                .buildAge(40)
                .build();
        System.out.println(userData.toString());
    }
}