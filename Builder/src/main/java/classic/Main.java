package classic;

public class Main {
    public static void main(String[] args) {
        UserDataBuilderImplementation userDataBuilderImplementation = new UserDataBuilderImplementation();
        BuildDirector buildDirector1 = new BuildDirector(userDataBuilderImplementation);
        buildDirector1.build();
        UserData userData = buildDirector1.getUserData();
        System.out.println(userData);
    }
}