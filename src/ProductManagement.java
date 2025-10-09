import java.util.Scanner;

public class ProductManagement {
    private ProductBuilder productBuilder;
    private CSVAdapter adapter = new CSVAdapter();
    private ElectronicProduct product;
    private Scanner scnr = new Scanner(System.in);


    public ElectronicProduct buildProduct(String productType) { //Laptop, Smartphone
        if (productType.equals("Laptop")) {
            product = buildLaptop();
        }
        if (productType.equals("Smartphone")) {
            product = buildSmartPhone();
        }
        product.displaySpecs();
        searchDefaultProduct(productType);
        return(product);
    }


    public void searchDefaultProduct(String productType) {
        System.out.println("Compared to: ");
        adapter.compareProduct(productType);
    }



    private ElectronicProduct buildLaptop() {
        LaptopBuilder productBuilder = new LaptopBuilder();
        System.out.println("Building Laptop");
        System.out.println("Select screen size (X x Y)");
        productBuilder.buildScreen(scnr.nextLine());
        System.out.println("Select processor");
        productBuilder.buildProcessor(scnr.nextLine());
        System.out.println("Select battery size");
        productBuilder.buildBattery(Integer.valueOf(scnr.nextLine()));
        System.out.println("Select storage size");
        productBuilder.buildStorage(Integer.valueOf(scnr.nextLine()));
        System.out.println("Select graphics card");
        productBuilder.buildGraphicsCard(scnr.nextLine());
        System.out.println("Select RAM amount");
        productBuilder.buildRAM(Integer.valueOf(scnr.nextLine()));
        System.out.println("Select OS");
        productBuilder.buildSoftware(scnr.nextLine());

        return(productBuilder.returnProduct());
    }

    private ElectronicProduct buildSmartPhone() {
        SmartPhoneBuilder productBuilder = new SmartPhoneBuilder();
        System.out.println("Building Smartphone");
        System.out.println("Select screen size (X x Y)");
        productBuilder.buildScreen(scnr.nextLine());
        System.out.println("Select processor");
        productBuilder.buildProcessor(scnr.nextLine());
        System.out.println("Select battery size");
        productBuilder.buildBattery(Integer.valueOf(scnr.nextLine()));
        System.out.println("Select storage size");
        productBuilder.buildStorage(Integer.valueOf(scnr.nextLine()));
        System.out.println("Select OS");
        productBuilder.buildSoftware(scnr.nextLine());

        return (productBuilder.returnProduct());
    }
}
