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
        System.out.print("Checking against CVS product name: "+ productName );
        System.out.print("Processing line: "+ productName );
        System.out.print("," + processor);
        System.out.print("," + ram);
        System.out.print("," + storage);
        System.out.print("," + graphicCard);
        System.out.print("," + OS);
        System.out.println(","+price);
    }

    public void displayCVS() {System.out.println(cvsAsString);};


    //Compare a product type with anything matching in the CSV file (must use same name)
    public ElectronicProduct compareProduct(String productType) {
        System.out.println("Looking for product: " + productType);
        int index = 7;
        boolean foundProduct = false;
        while (!(index >= splitString.length) && (foundProduct == false)) { //name, process, ram, storage, graphics, os, price
            displayProduct(splitString[index], splitString[index+1], splitString[index+2], splitString[index+3], splitString[index+4], splitString[index+5], splitString[index+6]);
            if (splitString[index].toLowerCase().contains(productType.toLowerCase())) { //ex: contains "laptop"
                foundProduct = true;
            }
            //debugging print
            //System.out.println(splitString[index].toLowerCase());
            if (!(foundProduct)) { //if product is found, do not increase index
                index = index + 7;
            }
        }
        if (foundProduct) {
            System.out.println("Product found and built: " + splitString[index]);
            System.out.println(""); //spacing
            if (splitString[index].contains("Laptop")) {
                return (new Laptop(splitString[index+1], Integer.parseInt(splitString[index+2]), splitString[index+4], splitString[index+5], Integer.parseInt(splitString[index+3]), Double.parseDouble(splitString[index+6])));
            }
            else if (splitString[index].contains("Smartphone")) {
                return (new SmartPhone(splitString[index+1], Integer.parseInt(splitString[index+2]), splitString[index+5], Integer.parseInt(splitString[index+3]), Double.parseDouble(splitString[index+6])));
            }
        }
        System.out.println("Product not found");
        System.out.println(""); //spacing
        return (new Laptop()); //return some default to prevent errors for now

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

