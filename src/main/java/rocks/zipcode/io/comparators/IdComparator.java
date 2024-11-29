package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        if (o1 == null && o2  ==null){
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null){
            return 1;
        }
        return Long.compare(o1.getId(), o2.getId());
    }
}
