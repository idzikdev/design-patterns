package classic;

public class UserDataBuilderImplementation implements UserDataBuilder {
    private UserData userData;

    public UserDataBuilderImplementation() {
        this.userData = new UserData();
    }

    @Override
    public void buildName() {
        this.userData.setName("Tom");
    }

    @Override
    public void buildSurname() {
        this.userData.setSurname("Idzik");
    }

    @Override
    public void buildAge() {
        this.userData.setAge(40);
    }

    @Override
    public UserData getUserData() {
        return userData;
    }
}