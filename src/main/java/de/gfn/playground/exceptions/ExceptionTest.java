package de.gfn.playground.exceptions;

public class ExceptionTest {

    public static void main(String[] args) {

        System.out.println("Hallo Welt: Start");

        String str = null;

        // Unchecked Exceptions: können behandelt werden, müssen aber nicht

        try {
            //String[] parts = str.split(""); // NullPointerException
            //int[] arr = new int[-5]; // NegativeArraySizeException
            int[] arr = new int[5];
            System.out.println(arr[8]); // ArrayIndexOutOfBoundsException
        }
        catch(NullPointerException e) {
            System.out.println("Zeichenkette nicht vorhanden");
        }
        catch(NegativeArraySizeException e) {
            System.out.println("Array darf keine negative Größe haben");
        }
        /*
        catch(RuntimeException e) {
            System.out.println("Irgendein Laufzeitproblem");
        }
        catch(Exception e) {
            //e.printStackTrace();
            //System.out.println(e.getCause());
            //System.out.println(e.getMessage());
            System.out.println("Es gibt ein Problem");
        }
        */

        System.out.println("Hallo Welt: Ende");
    }
}
