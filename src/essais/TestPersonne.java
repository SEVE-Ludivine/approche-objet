package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(1, "rue de la laiterie", 79330, "Saint-Varent");
        AdressePostale adresse2 = new AdressePostale(6, "rue des voituriers d'eau", 44200, "Nantes");

        Personne personne1 = new Personne("SEVE", "Ludivine", adresse1);
        Personne personne2 = new Personne("BOURASSEAU", "Nicolas", adresse2);


    }
}
