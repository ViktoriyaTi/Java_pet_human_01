import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Human anna = new Human("Анна");
        Cats murzik = new Cats("Мурзик", 5);
        Cats gosha = new Cats("Гоша", 7);
        Cats pryanik = new Cats("Пряник", 12);
        anna.setCall(false);
        anna.call();
        murzik.hearHuman(anna);
        Tiges leo = new Tiges("Лео", 10);
        leo.hunt();
        ArrayList<Cats> listCats = new ArrayList<>();
        listCats.add(murzik);
        listCats.add(gosha);
        listCats.add(pryanik);
        Collections.sort(listCats, new AnimalAgeComparator());
        System.out.println("Отсортированый список котов по возрасту(естественная сортировка): \n" + listCats);
    }
}
