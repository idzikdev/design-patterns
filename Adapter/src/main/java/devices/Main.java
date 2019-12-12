package devices;

public class Main {
    public static void main(String[] args) {
        UkDevice ukRadio = () -> System.out.println("Gramy na wyspach");
        UkSocket ukSocket = new UkSocket();
        ukSocket.plugIn(ukRadio);
        ContinentalDevice continentalRadio = () -> System.out.println("Gramy na kontynencie");
        ContinentalSocket continentalSocket = new ContinentalSocket();
        // użycie adaptera ukRadio podłączamy na kontynencie
        UkToContinentalAdapter adapter = new UkToContinentalAdapter(ukRadio);
        continentalSocket.plugIn(adapter);
    }
}
