import models.Printer;

public class Main {

    public static void main(String[] args) {


        Printer printer = new Printer("Ink Jet", "HP");
        printer.print();
        printer.scan();
        printer.showPrinterDetails();


    }

}
