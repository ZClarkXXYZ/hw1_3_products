import java.lang.invoke.StringConcatFactory;

public class Laptop extends ElectronicProduct{
    private String processor;
    private int storageSize;
    private String OS;
    private int RAM;
    private String graphicsCard;

    private double price;

    //default constructor
    Laptop() {
        this.price = 800.0; //DEFAULT PRICE FOR CUSTOM PRODUCTS
        this.storageSize = 0;
        this.processor = "none";
        this.RAM = 0;
        this.graphicsCard = "none";
        this.OS = "none";
    }
    //default constructor
    Laptop(String processor, int storageSize, String graphicsCard, String OS, int RAM, double price) {
        this.price = price;
        this.storageSize = storageSize;
        this.processor = processor;
        this.RAM = RAM;
        this.graphicsCard = graphicsCard;
        this.OS = OS;
    }

    //STORAGE
    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }
    //RAM
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
        System.out.print("Product: Laptop:");
        System.out.print("Specifications: {Processor=" + processor);
        System.out.print("Storage=" + storageSize);
        System.out.print("Graphics Card=" + graphicsCard);
        System.out.print("OS=" + OS);
        System.out.println("RAM="+ RAM + "}");
        System.out.println("Price: $" + price);
        System.out.println(""); //spacing
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
