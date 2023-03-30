public class Cat extends Animal{
    public Cat(String color, String name) {
        super(color, name);
    }
    public void makeSound(){
        System.out.println("Miał! Jestem "+this.name+" i mam kolor "+this.color);
    }
}
