public class SmartPhone extends ElectronicProduct{
    private String screenSize;
    private int storageSize;
    private String processor;
    private int batterySize;
    private String OS; //For preinstalled apps

    private double price;

    //constructor, default values to prevent errors
    SmartPhone() {
        this.price = 800.0;
        this.screenSize = "0x0";
        this.storageSize = 0;
        this.processor = "none";
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

    //SOFTWARE
    public void setOS(String os) {
        this.OS = os;
    }

    //Display Specs
    public void displaySpecs() {
        System.out.println("Smart Phone Info:");
        System.out.println("Screen size: " + screenSize);
        System.out.println("Storage size: " + storageSize);
        System.out.println("Battery: " + batterySize);
        System.out.println("Processor: "+ processor);
        System.out.println("OS: " + OS);
        System.out.println("Price: $" + price);
        System.out.println("");
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

