public class Laptop extends ElectronicProduct{
    private String screenSize;
    private int storageSize;
    private String processor;
    private int batterySize;
    private String OS;
    private int RAM;
    private String graphicsCard;

    private double price;

    //constructor
    Laptop() {
        this.price = 800.0;
        this.screenSize = "0x0";
        this.storageSize = 0;
        this.processor = "none";
        this.RAM = 0;
        this.graphicsCard = "none";
        this.batterySize = 0;
        this.OS = "none";
    }

    //SCREEN SIZE
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
    //BATTERY
    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }
    //STORAGE
    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }
    //HARDWARE
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public void setRAM(int ram) {
        this.RAM = ram;
    }
    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    //SOFTWARE
    public void setOS(String os) {
        this.OS = os;
    }

    //Display Specs
    public void displaySpecs() {
        System.out.println("Laptop Info:");
        System.out.println("Screen size: " + screenSize);
        System.out.println("Storage size: " + storageSize);
        System.out.println("Battery: " + batterySize);
        System.out.println("Processor: "+ processor);
        System.out.println("RAM: "+ RAM);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("OS: " + OS);
        System.out.println("Price: $" + price);
        System.out.println("");
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
