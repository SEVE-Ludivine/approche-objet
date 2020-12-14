package fr.diginamic.banque;

import fr.diginamic.banque.entites.CompteTaux;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {

        Operation[] operations = new Operation[4];
        operations[0] = new Debit("2018/12/14", 50.6);
        operations[1] = new Debit("2018/12/16", 20.6);
        operations[2] = new Credit("2020/12/14", 50.6);
        operations[3] = new Credit("2018/11/14", 21.6);
        double total = 0;
        for (Operation op:operations ){
            System.out.println(op.afficherType() +" : "+ op.getDateOperation() +" "+op.getMontantOperation());
            if (op instanceof Debit){
                total-=op.getMontantOperation();
            }
            else if (op instanceof Credit){
                total+=op.getMontantOperation();
            }
        }
        System.out.println(total);
    }
}
