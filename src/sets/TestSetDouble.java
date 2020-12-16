package sets;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class TestSetDouble {
    public static void main(String[] args) {
        HashSet<Double> hs = new HashSet<Double>();
        hs.add(1.5);
        hs.add(8.25);
        hs.add(-7.32);
        hs.add(13.3);
        hs.add(12.45);
        hs.add(48.5);
        hs.add(0.01);

        System.out.println("Afficher les éléments de la liste " +hs);
        System.out.println("Afficher le plus grand éléments de la liste " + Collections.max(hs));
        hs.remove(Collections.min(hs));
        System.out.println("Afficher les éléments de la liste sans le plus petit" + hs);


    }
}
