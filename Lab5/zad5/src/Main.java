public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.calculate(5));
        System.out.println(calculator.calculate(5,6));
        System.out.println(calculator.calculate(5,6,7));
    }
}