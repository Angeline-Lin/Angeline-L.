package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {


    public Button buttonAdd;
    public Button buttonSubtract;
    public Button buttonMultiply;
    public TextField textGetNum;
    public double total = 0;
    ArrayList<Double> numbers = new ArrayList<>();
    ArrayList<String> operations = new ArrayList<>();


    //Add Button
    public void addNum(ActionEvent actionEvent) {
        double num = Double.parseDouble(textGetNum.getText());
        numbers.add(num);
        operations.add("+");

    }
    //Subtract Button
    public void subtractNum(ActionEvent actionEvent) {
        double num = Double.parseDouble(textGetNum.getText());
        numbers.add(num);
        operations.add("-");
    }
    // Multiply Button
    public void multiplyNum(ActionEvent actionEvent) {
        double num = Double.parseDouble(textGetNum.getText());
        numbers.add(num);
        operations.add("x");
    }

    //Equal Button
    public void printEqual(ActionEvent actionEvent) {
        //Get number
        double num = Double.parseDouble(textGetNum.getText());
        numbers.add(num);

        int pos = numbers.size();
        for(int i = 0; i <= pos; i++){
        //Effects: add two numbers to total
        if (operations.contains("+") && numbers.size() == i + 2) {
            total = numbers.get(i) + numbers.get(i + 1);
        }
        //Effects: subtract two numbers to total
        if (operations.contains("-") && numbers.size() == i + 2) {
            total = numbers.get(i) - numbers.get(i + 1);
        }
        //Effects: multiply two numbers to total
        if (operations.contains("x") && numbers.size() == i + 2) {
            total = numbers.get(i) * numbers.get(i + 1);
        }
    }
        textGetNum.setText(Double.toString(total));
    }

    //Clear text Button
    public void clearText(ActionEvent actionEvent) {
        total = 0;
        numbers.clear();
        operations.clear();
        textGetNum.clear();
    }

    //numbers 0-9
    public void printZero(ActionEvent actionEvent) {
        textGetNum.setText(Double.toString(0));
    }
    public void printOne(ActionEvent actionEvent) {
        textGetNum.setText(Double.toString(1));
    }
    public void printTwo(ActionEvent actionEvent) {
        textGetNum.setText(Double.toString(2));
    }
    public void printThree(ActionEvent actionEvent) {
        textGetNum.setText(Double.toString(3));
    }
    public void printFour(ActionEvent actionEvent) {
        textGetNum.setText(Double.toString(4));
    }
    public void printFive(ActionEvent actionEvent) {
        textGetNum.setText(Double.toString(5));
    }
    public void printSix(ActionEvent actionEvent) {
        textGetNum.setText(Double.toString(6));
    }
    public void printSeven(ActionEvent actionEvent) {
        textGetNum.setText(Double.toString(7));
    }
    public void printEight(ActionEvent actionEvent) {
        textGetNum.setText(Double.toString(8));
    }
    public void printNine(ActionEvent actionEvent) {
        textGetNum.setText(Double.toString(9));
    }
}
