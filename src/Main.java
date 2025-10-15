public class Main {
    public static void main(String[] args) {
        //Tests:
        //1. Display CVS
        //2. build custom smartphone and laptop (HARDCODED in ProductManagement)
        //3. search for product in prebuild CVS "products.cvs"
        //4. display prebuilt products from cvs (after searching)

        ProductManagement productManagement = new ProductManagement();

        //TEST1
        productManagement.displayCSV();

        //TEST2
        productManagement.buildProduct("Laptop");
        productManagement.buildProduct("Smartphone");

        //TEST3&4 (done 2 times)
        productManagement.searchDefaultProduct("Smartphone Model X");
        productManagement.displayCVSProduct();
        productManagement.searchDefaultProduct("Laptop Model B");
        productManagement.displayCVSProduct();

    }
}