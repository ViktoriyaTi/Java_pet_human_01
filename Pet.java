public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
}
