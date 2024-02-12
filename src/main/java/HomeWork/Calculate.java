package HomeWork;

/*
Написать класс Калькулятор (необобщенный),
который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract().
Параметры этих методов – два числа разного типа,
над которыми должна быть произведена операция.
*/
public class Calculate {
    public static <T extends Number, K extends Number> void sum(T firstDigit, K secondDigit){
        System.out.println(firstDigit.doubleValue() + secondDigit.doubleValue());
    }
    public static <T extends Number, K extends Number> void multiply(T firstDigit, K secondDigit) {
        System.out.println(firstDigit.doubleValue() * secondDigit.doubleValue());
    }
    public static <T extends Number, K extends Number> void divide(T firstDigit, K secondDigit) {
        if(secondDigit.doubleValue() != 0) {
            System.out.println(firstDigit.doubleValue() / secondDigit.doubleValue());
        } else {
            System.out.println("Нельзя делить на 0");
        }
    }
    public static <T extends Number, K extends Number> void subtract(T firstDigit, K secondDigit) {
        System.out.println(firstDigit.doubleValue() - secondDigit.doubleValue());
    }
}
