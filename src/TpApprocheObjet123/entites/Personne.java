package TpApprocheObjet123.entites;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    public Personne(String nom, String prenom, AdressePostale adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }

    public void afficherNomPrenomUpperCase(){
        System.out.println(this.nom.toUpperCase() + " " + this.prenom);
    }

    //on peut surcharger une méthode
    // Mais il faut que chaque méthode n'ai pas le même nombre de parametre
    //Le type de méthode n'est pas une différence suffisante
    public void m(int a){

    }
    public void m (int a, int b){

    }
    /*
    public int m(int a){
        return 0;
    }*/

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
