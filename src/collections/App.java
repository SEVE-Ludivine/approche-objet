package collections;
import birds.Bird;
import birds.Dove;
import birds.Duck;
import birds.Penguin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("toto");
        list.add("titi");
        list.remove("toto");
        System.out.println(list.size());

        List<Bird> birdsList = new ArrayList<>();
        birdsList.add(new Dove("Peace"));
        birdsList.add(new Duck("Donald"));
        birdsList.add(new Penguin("Dsiofjo"));
        //Parcours foreach
        for (Bird item :birdsList){
            item.describe();
        }

        Iterator<Bird> iterator = birdsList.iterator();
        //Parcours ITERATOR
        while(iterator.hasNext()){
            Bird item = iterator.next();
            item.describe();
        }

        //Parcours index
        for (int i = 0, size = birdsList.size(); i < size; ++i) {
            birdsList.get(i).describe();
        }

    }
}