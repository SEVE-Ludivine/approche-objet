package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        List<String> listeString = new ArrayList<>();
        listeString.add("Nice");
        listeString.add("Carcassonne");
        listeString.add("Narbonne");
        listeString.add("Lyon");
        listeString.add("Foix");
        listeString.add("Pau");
        listeString.add("Marseille");
        listeString.add("Tarbes");

        String villeMaxLength = listeString.get(0);
        int maxLength= 0;
        for (String l:listeString){
            if(l.length()> maxLength){
                maxLength = l.length();
                villeMaxLength = l;
            }
        }
        System.out.println("Ville avec le plus grand nombres de lettre " +villeMaxLength);

        for (String l:listeString){
            listeString.set(listeString.indexOf(l), l.toUpperCase());
        }
        System.out.println("Villes écrites en majuscule " + listeString);

        listeString.removeIf(l ->(l.charAt(0)=='N'));
        System.out.println("Liste villes ne commençant pas par 'N' " + listeString);



    }
}
