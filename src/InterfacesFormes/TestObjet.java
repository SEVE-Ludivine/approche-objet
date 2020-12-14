package InterfacesFormes;

import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestObjet {
    public static void main(String[] args) {
        ObjetGeometrique[] objets = new ObjetGeometrique[2];
        objets[0] = new Cercle(12.5);
        objets[1] = new Rectangle(10.2, 14.2);

        for (ObjetGeometrique objet: objets){
            System.out.println("Perimetre: " +objet.perimetre());
            System.out.println("Surface: " +objet.surface());
        }

    }
}
