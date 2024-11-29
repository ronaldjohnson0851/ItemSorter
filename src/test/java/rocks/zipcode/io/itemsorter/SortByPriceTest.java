package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {

    @Test
            public  void SortPriceAscending() {
        Item item1 = new Item(0L, "Oreos", 2.0);
        Item item2 = new Item(1L, "Doritos", 1.5);
        Item item3 = new Item(2L, "Skittles", 1.0);
        Item[] itemsToSort = {item1, item2, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = new PriceComparator();

        Item[] actual = itemSorter.sort(comparator);

        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public  void SortPriceDescending() {
        Item item1 = new Item(0L, "Oreos", 2.0);
        Item item2 = new Item(1L, "Doritos", 1.5);
        Item item3 = new Item(2L, "Skittles", 1.0);
        Item[] itemsToSort = {item3, item2, item1};
        Item[] expected = {item1, item2, item3};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = new PriceComparator().reversed();


        Item[] actual = itemSorter.sort(comparator);


        Assert.assertArrayEquals(expected, actual);

    }


    @Test
    public  void SortPriceEqualPrice() {
        Item item1 = new Item(0L, "Oreos", 1.0);
        Item item2 = new Item(1L, "Doritos", 1.0);
        Item item3 = new Item(2L, "Skittles", 1.0);
        Item[] itemsToSort = {item1, item2, item3};
        Item[] expected = {item1, item2, item3};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = new PriceComparator();

        Item[] actual = itemSorter.sort(comparator);

        Assert.assertArrayEquals(expected, actual);

    }


}
