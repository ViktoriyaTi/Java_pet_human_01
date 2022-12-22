public class Main {
    public static void main(String[] args) {
        Human anna = new Human("Анна");
        Pet cat = new Pet("Мурзик");
        anna.setCall(false);
        anna.call();
        cat.hearHuman(anna);
        Tiges leo = new Tiges("Лео");
        leo.hunt();
    }
}
