package devices;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        UkDevice ukRadio = () -> logger.info("Gramy na wyspach");
        UkSocket ukSocket = new UkSocket();
        ukSocket.plugIn(ukRadio);
        ContinentalDevice continentalRadio = () -> logger.info("Gramy na kontynencie");
        ContinentalSocket continentalSocket = new ContinentalSocket();
        // użycie adaptera ukRadio podłączamy na kontynencie
        UkToContinentalAdapter adapter = new UkToContinentalAdapter(ukRadio);
        continentalSocket.plugIn(adapter);
    }
}