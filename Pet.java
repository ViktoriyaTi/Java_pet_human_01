
public class Pet extends Animal {
    public Pet(String name) {
        super(name);
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
