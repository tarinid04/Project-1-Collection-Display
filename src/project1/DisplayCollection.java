package project1;

import bag.Bag;
import bag.BagInterface;

import student.TestableRandom;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Tarini Duvvuri (tarinid)

/**
 * The DisplayCollection class displays a collection within a bag
 * 
 * @author tarinid (906554765)
 * @version 09.12.2023
 */
public class DisplayCollection {

    /**
     * This array contains a list of color names followed by the word "circle."
     * It is used to represent different colored circles in the application.
     * The order of colors in this array is significant for rendering purposes.
     */
    public static final String[] STRINGS = { "red circle", "blue circle",
        "red square", "blue square" };
    private BagInterface<String> itemBag;

    /**
     * Constructor for the DisplayCollection class.
     * Initializes the itemBag field using the default constructor of the Bag
     * class.
     */
    public DisplayCollection() {
        this.itemBag = new Bag<>();
        generateRandomItems();

    }


    /**
     * Getter method for the itemBag field.
     *
     * @return The itemBag field.
     */
    public BagInterface<String> getItemBag() {
        return itemBag;
    }


    /**
     * This is a Helper method that helps generate random numbers
     */
    private void generateRandomItems() {
        // Creating a TestableRandom object
        TestableRandom random = new TestableRandom();

        // Generating a random number between 5 and 15 (inclusive)
        int size = random.nextInt(11) + 5;

        // Adding random strings to the itemBag
        for (int i = 0; i < size; i++) {
            int randomIndex = random.nextInt(STRINGS.length);
            String randomString = STRINGS[randomIndex];
            itemBag.add(randomString);
        }
    }

}
