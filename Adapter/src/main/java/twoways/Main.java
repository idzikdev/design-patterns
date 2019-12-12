package twoways;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        ContinentalSocket continentalSocket = new ContinentalSocket();
        UkSocket ukSocket = new UkSocket();

        UkDevice ukDevice = () -> logger.info("UK Device is ready to play");
        ContinentalDevice continentalDevice = () -> logger.info("Continental device is ready to play");

        TwoWayAdapter adapter = new TwoWayAdapter(ukDevice, continentalDevice);
        continentalSocket.plugIn(adapter);
        ukSocket.plugIn(adapter);
    }
}