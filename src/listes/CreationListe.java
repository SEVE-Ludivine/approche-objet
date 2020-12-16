package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreationListe {
    public static void main(String[] args) {
        List<Integer> listesEntiers = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) {
            listesEntiers.add(i);
        }
        System.out.println(listesEntiers.size());
    }
}
