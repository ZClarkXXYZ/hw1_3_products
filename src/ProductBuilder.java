public interface ProductBuilder {

    //resetBuild
    void resetBuild();

    //Build storage
    void buildStorage(int storage);

    //Build hardware (processor)
    void buildProcessor(String processor);

    //Build software (OS)
    void buildSoftware(String software);

    //Build RAM
    void buildRAM(int ram);

    //Return product
    ElectronicProduct returnProduct();
}
