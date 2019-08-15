package model3_delegate;

class RealPrinter{
    void print(){
        System.out.println("something");
    }
}

class Print{
    RealPrinter realPrinter = new RealPrinter();

    void delegatedPrint(){
        realPrinter.print();
    }
}

public class Main {

    public static void main(String[] args) {
        Print print = new Print();
        print.delegatedPrint();
    }
}
