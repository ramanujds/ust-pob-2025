package models;

public class Printer extends GenericPrinter  {

    public Printer(String type, String brand) {
        super(type, brand);
    }

    public void print() {
        System.out.println("Hello, this is a printer!");
    }

    public void scan() {
        System.out.println("Scanned Document");
    }

    public void showPrinterDetails(){
        System.out.println("Brand : "+brand);
        System.out.println("Type : "+type);
    }

}
