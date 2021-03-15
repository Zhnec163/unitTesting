import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        float num1 = getNumber();
        float num2 = getNumber();
        String operator = getOperation();

        System.out.println(Calculator.calc(num1, num2, operator));
    }

    private static float getNumber(){
        System.out.print("Введите число:");
        float number;
        if(scanner.hasNextInt()){
            number = (float) scanner.nextInt();
        } else if(scanner.hasNextFloat()){
            number = scanner.nextFloat();
        } else {
            scanner.next();
            number = getNumber();
        }
        return number;
    }

    private static String getOperation(){
        System.out.print("Введите операцию:");
        String operation;
        if(scanner.hasNext()){
            operation = scanner.next();
        } else {
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
}
