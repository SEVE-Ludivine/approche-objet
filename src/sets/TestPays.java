package sets;

import listes.Villes;

import java.util.Collections;
import java.util.HashSet;

public class TestPays {
    public static void main(String[] args) {
        HashSet<Pays> hs = new HashSet<>();
        hs.add(new Pays("Usa", 331002651, 20023.14));
        hs.add(new Pays("France", 65273511, 2962.80));
        hs.add(new Pays("Allemagne", 83783942, 4356.35));
        hs.add(new Pays("Uk", 67886011, 3037.79));
        hs.add(new Pays("Italie", 60461826, 2397.40));
        hs.add(new Pays("Japon", 126476461, 5594.45));
        hs.add(new Pays("Chine", 1439323776, 25270.07));
        hs.add(new Pays("Russie", 145934462, 4213.40));
        hs.add(new Pays("Inde", 1380004385, 10505.29));


        double maxPib = 0;
        String paysMaxPib ="";
        for (Pays p:hs) {
            if(p.pibHabitants >maxPib) {maxPib=p.pibHabitants; paysMaxPib=p.nom;}
        }

        System.out.println("Pays avec le plus haut PIB/HAB " + paysMaxPib);

        double maxPib1 = 0;
        String paysMaxPib1 ="";
        for (Pays p:hs) {
            if((p.pibHabitants/p.nbHabitants) >maxPib1) {maxPib1=(p.pibHabitants/p.nbHabitants); paysMaxPib1=p.nom;}
        }

        System.out.println("Pays avec le plus haut PIB/HAB " + paysMaxPib1);

        //Mujuscule sur PIB min
        double minPib = 1000000;
        String paysMinPib ="";
        for (Pays p:hs) {
            if((p.pibHabitants/p.nbHabitants) <minPib) {minPib=(p.pibHabitants/p.nbHabitants); paysMinPib=p.nom;}
        }
        for (Pays p:hs) {
            if(p.nom.equals(paysMinPib)) {p.setNom(p.getNom().toUpperCase());}
        }

        for (Pays p:hs) {
            System.out.println(p.nom);
        }
        String finalPaysMinPib = paysMinPib;
        hs.removeIf(l->(l.nom.equalsIgnoreCase(finalPaysMinPib)));
        System.out.println("Liste des PAYS finaux");
        for (Pays p:hs) {
            System.out.println(p.nom +" "+p.nbHabitants + " "+ (p.pibHabitants/p.nbHabitants));
        }
    }
}
