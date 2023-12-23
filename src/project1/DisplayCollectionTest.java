package project1;

import static org.junit.Assert.*;
import bag.BagInterface;
import student.TestableRandom;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Tarini Duvvuri (tarinid)

/**
 * The DisplayCollection Test Class test the DisplayCollection Class
 * 
 * @author tarinid (906554765)
 * @version 09.12.2023
 */
public class DisplayCollectionTest extends student.TestCase {

    /**
     * This method sets up the test case class
     */
    public void setUp() {
        // The setUp() method is intentionally left empty
    }


    /**
     * This method tests the BagSize Class
     */
    public void testBagSize() {
        for (int i = 5; i <= 15; i++) {
            TestableRandom.setNextInts(i - 5);
            DisplayCollection dc = new DisplayCollection();

            BagInterface<String> bag = dc.getItemBag();

            // Checking that the bag's size is between 5 and 15 (inclusive)
            int bagSize = bag.getCurrentSize();
            assertTrue(bagSize >= 5 && bagSize <= 15);
        }
    }


    /**
     * This method tests the BagContents Class
     */
    public void testBagContents() {
        DisplayCollection dc = new DisplayCollection();
        BagInterface<String> bag = dc.getItemBag();

        // Checking that every string in the bag is one of the legal strings
        for (int i = 1; i <= bag.getCurrentSize(); i++) {
            String item = bag.remove();
            boolean isLegal = false;
            for (String legalString : dc.STRINGS) {
                if (item.equals(legalString)) {
                    isLegal = true;

                }
            }
            assertTrue(isLegal);
        }
    }

}
