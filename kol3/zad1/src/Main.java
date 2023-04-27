public class Main {
    public static void main(String[] args) {
        Krowa krowa = new Krowa();
        Fish fish = new Fish();
        Snake snake = new Snake();
        Animal[] tab = {krowa,fish,snake};
        for (Animal animal : tab) {
            animal.makeSound();
        }

    }
}