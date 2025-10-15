public class SmartPhone extends ElectronicProduct{
    private int storageSize;
    private String processor;
    private int RAM;
    private String OS; //For preinstalled apps

    private double price;

    //default constructor, default values to prevent errors
    SmartPhone() {
        this.price = 800.0; //DEFAULT PRICE FOR CUSTOM PRODUCTS
        this.storageSize = 0;
        this.RAM = 0;
        this.processor = "none";
        this.OS = "none";
    }

    //main constructor
    SmartPhone(String processor, int storageSize, String os, int RAM, double price) {
        this.price = price;
        this.storageSize = storageSize;
        this.processor = processor;
        this.OS = os;
        this.RAM = RAM;
    }


    //STORAGE
    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }
    //HARDWARE
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    //HARDWARE
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }
    //SOFTWARE
    public void setOS(String os) {
        this.OS = os;
    }

    //Display Specs
    public void displaySpecs() {
        System.out.print("Product: Smartphone:");
        System.out.print("Specifications: {Processor=" + processor);
        System.out.print(", Storage=" + storageSize);
        System.out.print(", Graphics Card=N/A");
        System.out.print(", OS=" + OS);
        System.out.println(", RAM=N/A}");
        System.out.println("Price: $" + price);
        System.out.println(""); //spacing
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

