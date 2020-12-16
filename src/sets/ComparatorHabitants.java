package sets;

import sets.Pays;

import java.util.Comparator;

public class ComparatorHabitants implements Comparator<Pays> {


    @Override
    public int compare(Pays o1, Pays o2) {
        int result = o1.nbHabitants.compareTo(o2.nbHabitants);
        return result;
    }
}
