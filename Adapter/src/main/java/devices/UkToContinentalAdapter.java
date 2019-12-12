package devices;

public class UkToContinentalAdapter implements ContinentalDevice {
    UkDevice ukDevice;

    public UkToContinentalAdapter(UkDevice ukDevice) {
        this.ukDevice = ukDevice;
    }

    @Override
    public void powerOn() {
        ukDevice.powerOn();
    }
}
