public interface ProductBuilder {

    //resetBuild
    void resetBuild();

    //Build screen size
    void buildScreen(String screen);

    //Build battery
    void buildBattery(int battery);

    //Build storage
    void buildStorage(int storage);

    //Build hardware (processor)
    void buildProcessor(String processor);

    //Build software (OS)
    void buildSoftware(String software);

    //Return product
    ElectronicProduct returnProduct();
}
