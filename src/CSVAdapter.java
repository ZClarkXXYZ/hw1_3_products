import java.io.FileReader;

public class CSVAdapter {
    private String cvsProducts = "products.csv";
    private FileReader fileReader;
    private String cvsAsString = "";
    private String[] splitString;
    int columns = 7; //columns are set, but rows are not.

    public CSVAdapter() {
        turnCSVFileToString();
        splitCVSString();
    }

    //display a product from CSV
    private void displayProduct(String productName, String processor, String ram, String storage, String graphicCard, String OS, String price) {
        System.out.println("Product: " + productName);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Graphics Card: " + graphicCard);
        System.out.println("OS: " + OS);
        System.out.println("Price: $" + price);
        System.out.println(""); //Blank line
    }


    //Compare a product type with anything matching in the CSV file (must use same name)
    public void compareProduct(String productType) {

        int index = 0;
        while (!(index >= splitString.length)) { //name, process, ram, storage, graphics, os, price
            if (splitString[index].toLowerCase().contains(productType.toLowerCase())) { //ex: contains "laptop"
                displayProduct(splitString[index], splitString[index+1], splitString[index+2], splitString[index+3], splitString[index+4], splitString[index+5], splitString[index+6]);
            }
            //debugging print
            //System.out.println(splitString[index].toLowerCase());
            index = index+1;
        }
    }


    //Take the string, and turn it into an array
    private void splitCVSString() {
        splitString = cvsAsString.split(",|\n");

        /*for (int i = 0; i < splitString.length; ++i) { //Debug testing print
            System.out.println(splitString[i]);
        }*/
    }

    //Take a CVS, turn into string
    private void turnCSVFileToString() {
        try {
            this.fileReader = new FileReader(cvsProducts);
        } catch (Exception e) {
            System.out.println(e);
        }

        String nextChar;
        try {
            while (fileReader.ready()) {
                try {
                    nextChar = String.valueOf(Character.toChars(fileReader.read()));
                    cvsAsString = cvsAsString + nextChar;
                } catch (Exception e) {
                    System.out.println(e);
                    //
                }
            }
        }
        catch (Exception e) {System.out.println(e);}

        //System.out.println(cvsAsString); //Bug Testing Print
    }
}

