import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        boolean koniec =false;
        int i = 0;
        while (!koniec){
            date = date.plusYears(1);
            if(date.isLeapYear()){
                System.out.println(date.getYear());
                i++;
            }
            if(i == 100){
                koniec = true;
            }
        }

    }
}