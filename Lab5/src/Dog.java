public class Dog extends Animal{

    public Dog(String color, String name) {
        super(color, name);
    }
    public void makeSound(){
        System.out.println("Hau Hau! Jestem "+this.name+" i mam kolor "+this.color);
    }
}
