package InterfacesFormes;

public class Cercle implements ObjetGeometrique{
    protected double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }
}
