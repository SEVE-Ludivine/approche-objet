package fr.diginamic.essais;

import static fr.diginamic.operations.Operations.calcul;

public class TestOperation {
    public static void main(String[] args) {
        System.out.println(calcul(2,3,'+'));
        System.out.println(calcul(2,3,'-'));
        System.out.println(calcul(2,3,'*'));
        System.out.println(calcul(2,3,'/'));


    }
}
