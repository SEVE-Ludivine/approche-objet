package sets;

public class Pays {
    String nom;
    int nbHabitants;
    double pibHabitants;

    public Pays(String nom, int nbHabitants, double pibHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibHabitants = pibHabitants;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public double getPibHabitants() {
        return pibHabitants;
    }

    public void setPibHabitants(double pibHabitants) {
        this.pibHabitants = pibHabitants;
    }
}
