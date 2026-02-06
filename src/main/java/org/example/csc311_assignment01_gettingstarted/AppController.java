package org.example.csc311_assignment01_gettingstarted;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;

public class AppController {
   @FXML
    private Label welcomeText;

    // ToDo 01: add two text fields to the GUI so that the user can find the sum
    @FXML
    private TextField input1;

    @FXML
    private TextField input2;


    // ToDo 02: when the button is clicked show the output on the screen
    @FXML protected void onCalculateButtonClick() {
        // ToDo 03: you should accept only the numeric values
        try{
            //get text and convert to double
            double num1 = Double.parseDouble(input1.getText());
            double num2 = Double.parseDouble(input2.getText());
            double result = num1 + num2;
            //display result
            welcomeText.setText("Sum: " + result);
        }
        catch (NumberFormatException e){
            //if types in letters
            welcomeText.setText("Only accepts number values.");
        }
    }


    // ToDo 04: modify the CSS file to make the background of the application Lightblue and the button color red

    // ToDo 05: commit changes and push back to the same repo



}