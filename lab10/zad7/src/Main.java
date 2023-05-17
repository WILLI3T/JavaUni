import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] studenci = new Student[3];
        studenci[0] = new Student("Jan", "Kowalski", "s12345");
        studenci[1] = new Student("Anna", "Nowak", "s23456");
        studenci[2] = new Student("Piotr", "Nowicki", "s34567");

        Arrays.sort(studenci);

        for (Student student : studenci) {
            System.out.println(student.getImie() + " " + student.getNazwisko() + " " + student.getIndeks());
        }
    }
}