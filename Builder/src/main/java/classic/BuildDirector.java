package classic;

public class BuildDirector {
    private UserDataBuilder userDataBuilder;

    public BuildDirector(UserDataBuilder userDataBuilder) {
        this.userDataBuilder = userDataBuilder;
    }

    public void build() {
        userDataBuilder.buildName();
        userDataBuilder.buildSurname();
        userDataBuilder.buildAge();
    }

    public UserData getUserData() {
        return this.userDataBuilder.getUserData();
    }
}