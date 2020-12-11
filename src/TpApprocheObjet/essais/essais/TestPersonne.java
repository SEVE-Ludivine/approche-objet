package TpApprocheObjet.essais.essais;

import TpApprocheObjet.essais.entites.AdressePostale;
import TpApprocheObjet.essais.entites.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale(1, "rue de la laiterie", 79330, "Saint-Varent");
        AdressePostale adresse2 = new AdressePostale(6, "rue des voituriers d'eau", 44200, "Nantes");

        Personne personne1 = new Personne("SEVE", "Ludivine", adresse1);
        Personne personne2 = new Personne("BOURASSEAU", "Nicolas");
        System.out.println(personne1.prenom);

        personne1.afficherNomPrenomUpperCase();
        personne2.setAdresse(adresse2);
        System.out.println(personne2.getAdresse().numeroRue +" "+ personne2.getAdresse().libelleRue +" "+ personne2.getAdresse().codePostal +" "+ personne2.getAdresse().ville);

    }
}
