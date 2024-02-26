import java.util.Scanner;

public class Calculator extends MyPhone {

    private int a;
    private int b;

    public Calculator() {
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public void getCalculator(int a,char operation ,int b){



        if(operation == '+'){
            int result = a + b;
            System.out.println(a + " + " + b + " = " +result);
        }
        if(operation == '-'){
            int result = a - b;
            System.out.println(a + " - " + b + " = " +result);
        }
        if(operation == '*'){
            int result = a * b;
            System.out.println(a + " * " + b + " = " +result);
        }
        if(operation == '/'){
            int result = a / b;
            System.out.println(a + " / " + b + " = " +result);
        }


    }
}

