import java.util.Scanner;

/**
 * Created by dom on 15.10.2016.
 */
public class TestMath implements MathM {
    public int number3;
    public int number1, number2;
    public char symbol;
    public String flags;

    public void startCalc(){}

    public void testScannerError(){}

    public void testElectionsError(){}

    public void testNextError(){}

    public void TEST(){
        System.out.println(number1);
    }

    /*
     * Set
     * */
    @Override
    public void setmU(int number1,int number2) {this.number3 = number1 * number2;}

    @Override
    public void setmD(int number1,int number2) {this.number3 = number1 / number2;}

    @Override
    public void setmV(int number1,int number2) {this.number3 = number1 - number2;}

    @Override
    public void setmS(int number1,int number2) {this.number3 = number1 + number2;}

    /*
    * GET
    * */

    @Override
    public int getmU(int number3) {return number3;}

    @Override
    public int getmD(int number3) {
        return number3;
    }

    @Override
    public int getmV(int number3) {
        return number3;
    }

    @Override
    public int getmS(int number3) {
        return number3;
    }

    @Override
    public String getError() {
        return "Error";
    }

}
