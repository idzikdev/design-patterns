package army;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Give us backup", 10, Rank.COMMANDER);
        Officer rookie = new Rookie();
        Officer captain = new Captain();
        Officer commander = new Commander();
        rookie.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(commander);
        System.out.println(rookie.processMessage(message));
    }
}