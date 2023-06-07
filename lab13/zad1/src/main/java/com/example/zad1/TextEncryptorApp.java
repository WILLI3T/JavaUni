package com.example.zad1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TextEncryptorApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Szyfrator Tekstu");

        // Tworzenie kontrolek
        TextArea inputTextArea = new TextArea();
        inputTextArea.setPromptText("Wpisz tekst...");

        TextField shiftTextField = new TextField();
        shiftTextField.setPromptText("Przesunięcie");

        Button encryptButton = new Button("Zaszyfruj");

        TextArea outputTextArea = new TextArea();
        outputTextArea.setEditable(false);

        // Dodawanie obsługi zdarzeń dla przycisku
        encryptButton.setOnAction(event -> {
            String inputText = inputTextArea.getText();
            String shiftText = shiftTextField.getText();
            int shift = Integer.parseInt(shiftText);

            String encryptedText = encryptText(inputText, shift);
            outputTextArea.setText(encryptedText);
        });

        // Tworzenie układu VBox
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(
                inputTextArea,
                shiftTextField,
                encryptButton,
                outputTextArea
        );

        // Ustawienie układu w scenie
        Scene scene = new Scene(vbox, 400, 300);

        // Wyświetlenie sceny
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private String encryptText(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isWhitespace(c)) {
                encryptedText.append(c); // zachowaj białe znaki
            } else {
                char shiftedChar = (char) (c + shift);
                encryptedText.append(shiftedChar);
            }
        }
        return encryptedText.toString();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

