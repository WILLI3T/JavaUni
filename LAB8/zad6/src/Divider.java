import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog(null, "Podaj liczbę");
        String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");

        try {
            int result = divide(convertToInteger(number), convertToInteger(divider));
            JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Błąd, wprowadzona wartość nie jest liczbą");
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Błąd, nie można dzielić przez zero");
        }
    }

    private static int convertToInteger(String number){
        return Integer.parseInt(number);
    }

    private static int divide(int number, int divider) {
        return number / divider;
    }
}
