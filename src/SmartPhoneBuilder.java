public class SmartPhoneBuilder implements ProductBuilder{
    SmartPhone smartPhone = new SmartPhone();


    //resetBuild
    @Override
    public void resetBuild() {
        this.smartPhone = new SmartPhone();
    }


    //Build screen size
    @Override
    public void buildScreen(String screen) {
        smartPhone.setScreenSize(screen);
    }

    //Build battery
    @Override
    public void buildBattery(int battery) {
        smartPhone.setBatterySize(battery);
    }

    //Build storage
    @Override
    public void buildStorage(int storage) {
        smartPhone.setStorageSize(storage);
    }

    //Build hardware
    @Override
    public void buildProcessor(String processor) {
        smartPhone.setProcessor(processor);
    }

    //Build software
    @Override
    public void buildSoftware(String OS) {
        smartPhone.setOS(OS);
    }

    //Get product
    @Override
    public SmartPhone returnProduct() {
        return(smartPhone);
    }
}
