package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte c1 = new Compte(20412, 25.3);

        System.out.println(c1.toString());
    }
}
