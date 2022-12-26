
public class Cats extends Animal {
    public Cats(String name, int age) {
        super(name, age);
    }

    public void hearHuman(Human human) {
        if (human.getCall()) {
            System.out.println("Питомец смотрит в сторону хозяина");
            comeToHuman();
        } else
            walk();
    }

    public void comeToHuman() {
        System.out.println("Питомец подошел к хозяину");
    }

    public void walk() {
        System.out.println("Питомец гуляет");
    }

    public void eat() {
        System.out.println("Питомец ест");
    }

}
