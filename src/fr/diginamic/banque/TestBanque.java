package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

import java.util.Arrays;

public class TestBanque {
    public static void main(String[] args) {
        Compte c1 = new Compte(20412, 25.2);
        Compte c2 = new Compte(20413, 56.3);

        System.out.println(c1.toString());
        //Creer un tableau de compte TP3 HERITAGE ET CONTRUCTEURS
        CompteTaux[] comptes = new CompteTaux[2];
        comptes[0] = new CompteTaux(21352,23.9);
        comptes[1] = new CompteTaux(21384,154.5, 2.5);

        for (CompteTaux ct:comptes) {
            System.out.println(ct.toString());
        }

    }
}
