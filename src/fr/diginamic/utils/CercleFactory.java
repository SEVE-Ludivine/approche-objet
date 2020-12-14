package fr.diginamic.utils;

import InterfacesFormes.Cercle;

public class CercleFactory {
    public static Cercle addCercle(double rayonCercle){
        Cercle cercle = new Cercle(rayonCercle);
        return cercle;
    }

}
