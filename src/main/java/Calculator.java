import java.util.Scanner;

public class Calculator {

    private static Scanner scanner = new Scanner(System.in);

    public static Object calculate(){
        return calc(getNumber(), getNumber(), getOperation());
    }

    private static char getOperation(){
        System.out.print("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    private static float getNumber(){
        System.out.print("Введите число:");
        float number;
        if(scanner.hasNextInt()){
            number = (float)scanner.nextInt();
        } else if(scanner.hasNextDouble()) {
            number = (float)scanner.nextDouble(); /////////////////////
        } else if(scanner.hasNextFloat()) {
            number = scanner.nextFloat();
        } else {
            scanner.next();
            number = getNumber();
        }
        return number;
    }

    public static Object calc(Object num1, Object num2, char operation){
        Object result = 0f;
        switch (operation){
            case '+':
                result = sum(num1, num2);
                break;
            case '-':
                //result = subtract(num1, num2);
                break;
            case '*':
                //result = multiply(num1, num2);
                break;
            case '/':
                //result = divide(num1, num2);
                break;
            default:
                System.out.println("Неверная операция!");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }

    private static Object sum(Object one, Object two) {
        return (float)one + (float)two;
    }

    private static Object subtract(Object one, Object two) {
        return (float)one - (float)two;
    }

    private static Object divide(Object one, Object two) {
        return (float)one / (float)two;
    }

    private static Object multiply(Object one, Object two) {
        return (float)one * (float)two;
    }
}
