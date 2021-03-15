public class Calculator {

    public static Object calc(Object num1, Object num2, char operation){
        Object result;
        switch (operation){
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
                if((float)num2 == 0){
                    result = "на 0 делить нельзя";
                    break;
                }
                result = divide(num1, num2);
                break;
            default:
                result = "не верный оператор";
                System.out.println("Неверная операция!");
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
