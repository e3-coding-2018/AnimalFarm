public class Chicken extends Animal {

    public Chicken(String name) {
        super(name);
    }

    public Chicken() {
        super();
    }

    @Override
    public void makeNoise() {
        System.out.println("Cluck");
    }
}
