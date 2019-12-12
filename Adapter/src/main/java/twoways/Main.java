package twoways;

public class Main {
    public static void main(String[] args) {
        ContinentalSocket continentalSocket = new ContinentalSocket();
        UkSocket ukSocket = new UkSocket();

        UkDevice ukDevice = () -> System.out.println("UK Device is ready to play");
        ContinentalDevice continentalDevice = () -> System.out.println("Continental device is ready to play");

        TwoWayAdapter adapter = new TwoWayAdapter(ukDevice, continentalDevice);
        continentalSocket.plugIn(adapter);
        ukSocket.plugIn(adapter);
    }
}
