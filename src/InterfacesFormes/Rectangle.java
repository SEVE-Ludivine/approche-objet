package InterfacesFormes;

public class Rectangle implements ObjetGeometrique{
    protected double longueur;
    protected double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return 2*longueur+2*largeur ;
    }

    @Override
    public double surface() {
        return longueur*largeur;
    }
}
