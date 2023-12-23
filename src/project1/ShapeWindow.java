package project1;

import java.awt.Color;
import bag.Bag;
import bag.BagInterface;
import cs2.TextShape;

import student.TestableRandom;
import cs2.Window;
import cs2.Button;

import cs2.WindowSide;

// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those who
// do.
// -- Tarini Duvvuri (tarinid)

/**
 * The ShapeWindow class provides a simple GUI that displays a
 * square shape centered at the top of the window. Red and Yellow Buttons
 * can be used to change the foreground color of the shape.
 * 
 * @author tarinid (906554765)
 * @version 09.12.2023
 */
public class ShapeWindow {
    private Window window;
    private BagInterface<String> itemBag;
    private Button quitButton;
    private Button chooseButton;
    private TextShape textShape;

    // Constructor
    public ShapeWindow(BagInterface<String> itemBag) {
        // Initializing the window and setting its title
        window = new Window();
        window.setTitle("Project 1");

        // Initializing the itemBag field
        this.itemBag = itemBag;

        // Initializing the quitButton
        quitButton = new Button("Quit");
        quitButton.onClick(this, "clickedQuit");
        window.addButton(quitButton, WindowSide.NORTH);

        // Initializing the chooseButton
        chooseButton = new Button("Choose");
        chooseButton.onClick(this, "clickedChoose");
        window.addButton(chooseButton, WindowSide.SOUTH);

        // Initializin g the textShape field
        textShape = new TextShape(0, 0, "");
        window.addShape(textShape);
    }


    /**
     * Method called when the Quit button is clicked
     */
    public void clickedQuit(Button button) {
        System.exit(0);
    }


    /**
     * Method called when the Choose button is clicked
     */
    public void clickedChoose(Button button) {

        if (!(itemBag.isEmpty())) {
            String item = itemBag.remove();
            textShape.setText(item);
            colorText();
            centerText();
        }
        else {
            textShape.setText("No more items.");
            textShape.setForegroundColor(Color.BLACK);
            centerText();
        }
        window.repaint();
    }


    /**
     * Method changes the color of the text
     */
    private void colorText() {
        if (textShape.getText().contains("red")) {
            textShape.setForegroundColor(Color.RED);
        }
        else if (textShape.getText().contains("blue")) {
            textShape.setForegroundColor(Color.BLUE);
        }
        else {
            textShape.setForegroundColor(Color.BLACK);
        }
    }


    /**
     * Method puts text in the center
     */
    private void centerText() {
        int windowWidth = window.getGraphPanelWidth();
        int windowHeight = window.getGraphPanelHeight();
        int textWidth = textShape.getWidth();
        int textHeight = textShape.getHeight();

        int x = (windowWidth - textWidth) / 2;
        int y = (windowHeight - textHeight) / 2;

        textShape.setX(x);
        textShape.setY(y);
    }

}
