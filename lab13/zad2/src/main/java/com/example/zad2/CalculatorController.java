package com.example.zad2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField displayTextField;

    private StringBuilder input = new StringBuilder();
    private double number1 = 0;
    private double number2 = 0;
    private String operator = "";
    private boolean startNewInput = true;
    @FXML
    public void initialize(){
        displayTextField.setEditable(false);
    }

    @FXML
    private void handleNumberButton(ActionEvent event) {

        Button button = (Button) event.getSource();
        String digit = button.getText();

        if (startNewInput) {
            displayTextField.clear();
            startNewInput = false;
        }

        displayTextField.appendText(digit);
        input.append(digit);
    }

    @FXML
    private void handleOperatorButton(ActionEvent event) {
        Button button = (Button) event.getSource();
        String newOperator = button.getText();

        if (input.length() > 0) {
            if (operator.isEmpty()) {
                number1 = Double.parseDouble(input.toString());
            } else {
                number2 = Double.parseDouble(input.toString());
                calculate();
            }
        }

        operator = newOperator;
        input.setLength(0);
        startNewInput = true;
    }

    @FXML
    private void handleEqualsButton(ActionEvent event) {
        if (input.length() > 0 && !operator.isEmpty()) {
            number2 = Double.parseDouble(input.toString());
            calculate();
            operator = "";
            input.setLength(0);
            startNewInput = true;
        }
    }

    @FXML
    private void handleDecimalButton(ActionEvent event) {
        if (startNewInput) {
            displayTextField.clear();
            startNewInput = false;
        }

        if (input.length() == 0) {
            displayTextField.appendText("0");
            input.append("0");
        }

        if (!input.toString().contains(".")) {
            displayTextField.appendText(".");
            input.append(".");
        }
    }

    @FXML
    private void handleClearButton(ActionEvent event) {
        displayTextField.clear();
        input.setLength(0);
        number1 = 0;
        number2 = 0;
        operator = "";
        startNewInput = true;
    }


    private void calculate() {
        switch (operator) {
            case "+":
                double sum = number1 + number2;
                displayTextField.setText(String.valueOf(sum));
                break;
            case "-":
                double difference = number1 - number2;
                displayTextField.setText(String.valueOf(difference));
                break;
            case "*":
                double product = number1 * number2;
                displayTextField.setText(String.valueOf(product));
                break;
            case "/":
                if (number2 != 0) {
                    double quotient = number1 / number2;
                    displayTextField.setText(String.valueOf(quotient));
                } else {
                    displayTextField.setText("Error: Division by zero");
                }
                break;
        }
    }

}

