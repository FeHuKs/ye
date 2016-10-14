import java.util.Scanner;

/**
 * Created by dom on 13.10.2016.
 */
public class Main implements MathM{

    public static void main(String[] args) {
        int number1, number2, number3;
        char symbol;




        System.out.println("1.) number1 :");
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextInt();
        System.out.println("2.) symbols + , * , - , / . :");
        symbol = scanner.next().charAt(0);
        System.out.println("3.) number3 :");
        number2 = scanner.nextInt();

        switch (symbol) {
            case '+': {}
            case '-': {}
            case '*': {}
            case '/': {}
            default: {}
        }
    }


    @Override
    public void setmU(int number1,int number2) {

    }

    @Override
    public void setmD(int number1,int number2) {

    }

    @Override
    public void setmV(int number1,int number2) {

    }

    @Override
    public void setmS(int number1,int number2) {

    }

    @Override
    public int getmU(int number3) {
        return number3;
    }

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
        return null;
    }
}
