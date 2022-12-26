public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer setAge(int age) {
        return this.age = age;
    }

    abstract void walk();

    abstract void eat();

    public String toString() {
        return name + " " + "возраст:" + age;
    }
}
