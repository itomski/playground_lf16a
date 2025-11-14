package de.gfn.playground.exceptions;

public class ExceptionTest2 {

    public static void main(String[] args) {
        try {
            checkValue(250);
        }
        catch (ZuGrossException e) {
            System.out.println("ZU GROSS!");
        }
        catch (ZuKleinException e) {
            System.out.println("ZU KLEIN!");
        }
    }

//    private static void checkValue(int value) {
//
//        if(value > 0 && value < 200) {
//            System.out.println("OK");
//        }
//        else if(value < 0) {
//            throw new RuntimeException("Wert zu klein!");
//        }
//        else {
//            throw new RuntimeException("Wert zu groß!");
//        }
//    }

    private static void checkValue(int value) {

        if(value > 0 && value < 200) {
            System.out.println("OK");
        }
        else if(value < 0) {
            throw new ZuKleinException();
        }
        else {
            throw new ZuGrossException();
        }
    }
}
