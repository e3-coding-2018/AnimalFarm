public abstract class Animal {
    private String name = "";

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeNoise();

    public void eat() {
        System.out.format("%s is eating.\n", name.isEmpty()?"An animal":name);
    }
}
