package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        List<Integer> listeInt = new ArrayList<Integer>() ;
        listeInt.add(-1);
        listeInt.add(5);
        listeInt.add(7);
        listeInt.add(3);
        listeInt.add(-2);
        listeInt.add(4);
        listeInt.add(8);
        listeInt.add(5);
        System.out.println("Element de la liste " +listeInt);
        System.out.println("Taille de la liste " +listeInt.size());

        System.out.println("Plus grand élément de la liste " + Collections.max(listeInt));
        listeInt.remove(Collections.min(listeInt));
        System.out.println("Liste sans le plus petit élément " +listeInt);
        for(Integer l:listeInt){
            if(l<0) listeInt.set(listeInt.indexOf(l), -l);
        }
        System.out.println("Liste avec nombres négatifs devenus positifs " +listeInt);


    }
}
