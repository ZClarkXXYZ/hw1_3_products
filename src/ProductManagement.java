
public class ProductManagement {
    private ProductBuilder productBuilder;
    private CSVAdapter adapter = new CSVAdapter();
    private ElectronicProduct product;
    private ElectronicProduct productFromCVS;


    public void buildProduct(String productType) { //Laptop, Smartphone
        if (productType.equals("Laptop")) {
            product = buildLaptop();
        }
        if (productType.equals("Smartphone")) {
            product = buildSmartPhone();
        }
        product.displaySpecs();
    }

    public void displayProduct() {
        System.out.println("CUSTOMIZED PRODUCT: ");
        product.displaySpecs();
    }
    public void displayCVSProduct() {
        System.out.println("DEFAULT PRODUCT FROM CVS: ");
        productFromCVS.displaySpecs();
    }

    public void displayCSV() {
        adapter.displayCVS();
    };

    public void searchDefaultProduct(String productType) {
        productFromCVS = adapter.compareProduct(productType);
    }


    //hardcode?
    private ElectronicProduct buildLaptop() {
        LaptopBuilder productBuilder = new LaptopBuilder();
        System.out.println("CUSTOMIZED PRODUCT: ");
        productBuilder.buildProcessor("Intel i5");
        productBuilder.buildStorage(256);
        productBuilder.buildGraphicsCard("Integrated");
        productBuilder.buildSoftware("Windows 10");
        productBuilder.buildRAM(8);
        return(productBuilder.returnProduct());
    }

    private ElectronicProduct buildSmartPhone() {
        SmartPhoneBuilder productBuilder = new SmartPhoneBuilder();
        System.out.println("CUSTOMIZED PRODUCT: ");
        productBuilder.buildProcessor("Qualcomm");
        productBuilder.buildStorage(256);
        productBuilder.buildSoftware("Android");
        return (productBuilder.returnProduct());
    }
}
