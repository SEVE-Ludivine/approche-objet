package sets;

import java.util.Comparator;

public class ComparatorPibHabitant implements Comparator<Pays> {


    @Override
    public int compare(Pays o1, Pays o2) {
        int result = o1.pibHabitants.compareTo(o2.pibHabitants);
        return result;
    }
}
