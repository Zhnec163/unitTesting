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

    private static Object getNumber(){
        System.out.print("Введите число:");
        Object number;
        if(scanner.hasNextInt()){
            number = (float)scanner.nextInt();
        } else if(scanner.hasNextFloat()) {
            number = scanner.nextFloat();
        } else {
            scanner.next();
            number = getNumber();
        }
        return number;
    }

    private static Object calc(Object num1, Object num2, Object operation){
        Object result;
        switch ((char)operation){
            case '+':
                result = sum(num1, num2);
                break;
            case '-':
                result = subtract(num1, num2);
                break;
            case '*':
                result = multiply(num1, num2);
                break;
            case '/':
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Неверная операция!");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }

    public static Object sum(Object one, Object two) {
        //System.out.println("Складываем "+ one + " и " + two);
        int result = (int)one + (int)two;
        return result;
    }

    public static Object subtract(Object one, Object two) {
        //System.out.println("Вычитаем "+ one + " и " + two);
        float result = (float)one - (float)two;
        return result;
    }

    public static Object divide(Object one, Object two) {
        //System.out.println("Делим "+ one + " на " + two);
        float result = (float)one / (float)two;
        return result;
    }

    public static Object multiply(Object one, Object two) {
        //System.out.println("Умножаем "+ one + " и " + two);
        float result = (float)one * (float)two;
        return result;
    }
}
