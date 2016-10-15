import java.util.Scanner;

/**
 * Created by dom on 15.10.2016.
 */
public class Math2 extends  Math3 {
public void startCalc(){
    do{
        testScannerError();
        testEl1ectionsError();
        testNextError();
    }while (flags.equals("Y") || flags.equals("y"));
    System.out.println("Bye-Bye");
}

    public void testScannerError(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.) number1 : ");
        number1 = scanner.nextInt();
        System.out.print("2.) symbols + , * , - , / . : ");
        symbol = scanner.next().charAt(0);
        System.out.print("3.) number2 : ");
        number2 = scanner.nextInt();
    }

    public void testEl1ectionsError(){
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

}
