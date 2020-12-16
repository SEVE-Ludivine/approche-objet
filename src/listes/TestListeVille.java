package listes;

import javax.management.ListenerNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class TestListeVille {
    public static void main(String[] args) {
        List<Villes> listeVille = new ArrayList<>();
        listeVille.add(new Villes("Nice", 343000));
        listeVille.add(new Villes("Carcassonne", 47800));
        listeVille.add(new Villes("Narbonne", 53400));
        listeVille.add(new Villes("Lyon", 484000));
        listeVille.add(new Villes("Foix", 9700));
        listeVille.add(new Villes("Pau", 77200));
        listeVille.add(new Villes("Marseille", 850700));
        listeVille.add(new Villes("Tarbes", 40600));

        Villes maxHabitant = listeVille.get(0);
        for (Villes ville:listeVille){
            if(maxHabitant.nbHabitant< ville.nbHabitant)maxHabitant = ville;
        }
        System.out.println("Ville avec le plus d'habitants " +maxHabitant.nom +" "+ maxHabitant.nbHabitant);

        Villes minHabitant = listeVille.get(0);
        for (Villes ville:listeVille){
            if(minHabitant.nbHabitant> ville.nbHabitant)minHabitant = ville;
        }
        listeVille.remove(minHabitant);
        System.out.println("Liste des villes sans celle avec le moins d'habitants ");
        for (Villes v:listeVille) {
            System.out.println(v.nom);
        }

        for (Villes ville:listeVille){
            if(ville.nbHabitant > 100000)ville.nom = ville.nom.toUpperCase();
        }
        System.out.println("Afficher en majuscules le nom des villes avec plus de 100000 habitants ");
        for (Villes v:listeVille) {
            System.out.println(v.nom);
        }


    }
}
