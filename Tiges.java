public class Tiges extends Animal implements Huntable {

    public Tiges(String name) {
        super(name);
    }

    @Override
    void walk() {
        System.out.println("Тигр ходит");

    }

    @Override
    void eat() {
        System.out.println("Тигр ест");

    }

    public void hunt() {
        System.out.println("Тигр охотится");

    }
}