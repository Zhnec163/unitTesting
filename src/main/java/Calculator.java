public class Calculator {

    public static Object calc(Object num1, Object num2, Object operation){
        Object result;
        if (!(num1 instanceof Float) || !(num2 instanceof Float)){
            result = "это не числа";
            return result;
        }
        switch ((String) operation) {
            case "+":
                result = sum(num1, num2);
                break;
            case "-":
                result = subtract(num1, num2);
                break;
            case "*":
                result = multiply(num1, num2);
                break;
            case "/":
                if ((float)num2 == 0) {
                    result = "на 0 делить нельзя";
                    break;
                }
                result = divide(num1, num2);
                break;
            default:
                result = "не верный оператор";
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
