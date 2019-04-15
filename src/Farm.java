import java.util.ArrayList;

public class Farm {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        // Note: I can not create an animal because it is abstract
        // Animal animal = new Animal("Unknown Animal");

        Cow bessie = new Cow("Bessie");
        Cow sueEllen = new Cow("Sue Ellen");

        animals.add(bessie);
        animals.add(sueEllen);

        // Note: I do not need variables for the animals
        // I can add them to the list when I create them.
        animals.add(new Chicken());
        animals.add(new Chicken());
        animals.add(new Chicken());
        animals.add(new Chicken("Bucky"));

        for (Animal animal: animals) {
            animal.eat();
            animal.makeNoise();
        }
    }
}
