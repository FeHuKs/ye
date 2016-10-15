import java.util.Scanner;

/**
 * Created by dom on 15.10.2016.
 */
public class TestMath implements MathM {
    public int number3;
    public int number1, number2;
    public char symbol;
    public String flags;

    public void testScannerError(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.) number1 : ");
        number1 = scanner.nextInt();
        System.out.print("2.) symbols + , * , - , / . : ");
        symbol = scanner.next().charAt(0);
        System.out.print("3.) number2 : ");
        number2 = scanner.nextInt();
    }

    public void testElectionsError(){
        switch (symbol) {
            case '+': {setmS(number1,number2);System.out.println(number1 + " + " + number2 + " = " + getmS(number3));break;}
            case '-': {setmV(number1,number2);System.out.println(number1 + " - " + number2 + " = " + getmV(number3));break;}
            case '*': {setmU(number1,number2);System.out.println(number1 + " * " + number2 + " = " + getmU(number3));break;}
            case '/': {if(number1 > 0)setmD(number1,number2);else {System.out.println(number1 + " < 0   Error");break;}System.out.println(number1 + " / " + number2 + " = " + getmD(number3));break;}
            default: {System.out.println(getError());break;}}
    }

    public void testNextError(){
        do {
            System.out.print("Return? - \"Y\" or \"N\" : ");
            Scanner returnW = new Scanner(System.in);
            flags = returnW.nextLine();
        }while (!(flags.equals("Y") || flags.equals("N") || flags.equals("y") || flags.equals("n")));
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
