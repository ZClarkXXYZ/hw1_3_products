public class SmartPhoneBuilder implements ProductBuilder{
    SmartPhone smartPhone = new SmartPhone();


    //resetBuild
    @Override
    public void resetBuild() {
        this.smartPhone = new SmartPhone();
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

    //Build RAM
    @Override
    public void buildRAM(int RAM) {
        smartPhone.setRAM(RAM);
    }

    //Get product
    @Override
    public SmartPhone returnProduct() {
        return(smartPhone);
    }
}
