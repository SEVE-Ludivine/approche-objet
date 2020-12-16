package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("USA");
        hs.add("France");
        hs.add("Allemagne");
        hs.add("UK");
        hs.add("Italie");
        hs.add("Japon");
        hs.add("Chine");
        hs.add("Russie");
        hs.add("Inde");


        String paysMax ="";
        int maxLength= 0;
        for (String s:hs){
            if(s.length()> maxLength){
                maxLength = s.length();
                paysMax = s;
            }
        }
        hs.remove(paysMax);
        System.out.println("Pays sans le pays avec le plus grand nombres de lettre " +hs);


    }
}
