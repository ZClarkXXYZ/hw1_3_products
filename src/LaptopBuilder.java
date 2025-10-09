import java.util.Scanner;
public class LaptopBuilder implements ProductBuilder, ComputerBuilderInterface {
    Laptop laptop = new Laptop();

    //resetBuild
    @Override
    public void resetBuild() {
        this.laptop = new Laptop();
    }


    //Build screen size
    @Override
    public void buildScreen(String screen) {
        laptop.setScreenSize(screen);
    }

    //Build battery
    @Override
    public void buildBattery(int battery) {
        laptop.setBatterySize(battery);
    }

    //Build storage
    @Override
    public void buildStorage(int storage) {
        laptop.setStorageSize(storage);
    }

    //Build hardware
    @Override
    public void buildProcessor(String processor) {
        laptop.setProcessor(processor);
    }
    @Override
    public void buildGraphicsCard(String graphicsCard) { //ComputerBuilderInterface
        laptop.setGraphicsCard(graphicsCard);
    }
    @Override
    public void buildRAM(int ram) { //ComputerBuilderInterface
        laptop.setRAM(ram);
    }

    //Build software
    @Override
    public void buildSoftware(String OS) {
        laptop.setOS(OS);
    }

    //Get product
    @Override
    public Laptop returnProduct() {
        return(laptop);
    }
}
