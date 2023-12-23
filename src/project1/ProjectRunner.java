package project1;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Tarini Duvvuri (tarinid)

/**
 * The Project Runner runs the GUI
 * 
 * @author tarinid (906554765)
 * @version 09.12.2023
 */
public class ProjectRunner {

    public static void main(String[] args) {
        // Creating a new instance of the DisplayCollection class
        DisplayCollection displayCollection = new DisplayCollection();

        // Creating a new ShapeWindow instance and passing the itemBag from
        // DisplayCollection
        ShapeWindow shapeWindow = new ShapeWindow(displayCollection
            .getItemBag());

    }
}
