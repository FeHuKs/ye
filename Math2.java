import java.util.Scanner;

/**
 * Created by dom on 15.10.2016.
 */
public class Math2 extends TestMath implements MathM {
    public int number3;
    int number1, number2;
    char symbol;
    String flags;

public void startCalc(){
    do{
        testScannerError();
        testElectionsError();
        testNextError();
    }while (flags.equals("Y"));
    System.out.println("Bye-Bye");

}
}
