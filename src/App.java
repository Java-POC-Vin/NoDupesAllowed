import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> fruitsList1 = new ArrayList<>();
        fruitsList1.add("Morango");
        fruitsList1.add("Banana");
        fruitsList1.add("Maçã");
        fruitsList1.add("Uva");
        fruitsList1.add("Caqui");

        List<String> fruitsList2 = new ArrayList<>();
        fruitsList2.add("Manga");
        fruitsList2.add("Caqui");
        fruitsList2.add("Morango");
        fruitsList2.add("Amora");

        fruitsList1.retainAll(fruitsList2);
        int dupedFruitsAmount = fruitsList1.size();

        if (dupedFruitsAmount == 0) {
            System.out.println("Não tem nenhuma fruta duplicada.");
            return;
        }

        for (int i = 0; i < dupedFruitsAmount; i++) {
            System.out.println(fruitsList1.get(i));
        }

    }
}
