package rocks.zipcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private Item[] item;

    public ItemSorter(Item[] items) {
        this.item = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        List<Item> itemList = new ArrayList<>(Arrays.asList(this.item));
        Item[] result = new Item[this.item.length];
        itemList.sort(comparator);
        for (int i = 0; i < result.length; i++){
            result[i] = itemList.get(i);
        }

        return result;

    }
}
