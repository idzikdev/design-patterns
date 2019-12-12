package twoways;

public class TwoWayAdapter implements UkDevice, ContinentalDevice {
    UkDevice ukDevice;
    ContinentalDevice continentalDevice;

    public TwoWayAdapter(UkDevice ukDevice, ContinentalDevice continentalDevice) {
        this.ukDevice = ukDevice;
        this.continentalDevice = continentalDevice;
    }


    @Override
    public void powerOnContinentDevice() {
        ukDevice.powerOnUkDevice();
    }

    @Override
    public void powerOnUkDevice() {
        continentalDevice.powerOnContinentDevice();
    }
}
