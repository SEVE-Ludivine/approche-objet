package sets;

public class Pays implements Comparable<Pays>{
    String nom;
    Integer nbHabitants;
    Double pibHabitants;

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

    @Override
    public int compareTo(Pays o) {
        int result = this.pibHabitants.compareTo(o.pibHabitants);
        return result;
    }
}
