package com.example.zad1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculatorApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Kalkulator wieku");

        // Tworzenie kontrolek
        Label nameLabel = new Label("Podaj imię:");
        TextField nameTextField = new TextField();
        nameTextField.setPromptText("Podaj imię");

        Label dateLabel = new Label("Wybierz datę urodzenia:");
        DatePicker datePicker = new DatePicker();

        Button calculateButton = new Button("Oblicz");

        Label resultLabel = new Label();

        // Dodawanie obsługi zdarzeń dla przycisku
        calculateButton.setOnAction(event -> {
            String name = nameTextField.getText();
            LocalDate birthDate = datePicker.getValue();
            if (birthDate == null) {
                resultLabel.setText("Wybierz datę urodzenia!");
                return;
            }

            LocalDate currentDate = LocalDate.now();
            if (birthDate.isAfter(currentDate)) {
                resultLabel.setText("Wprowadzono datę w przyszłości!");
                nameTextField.clear();
                datePicker.setValue(null);
                return;
            }

            int age = Period.between(birthDate, currentDate).getYears();
            resultLabel.setText(name + " ma " + age + " lat");
        });

        // Tworzenie układu VBox
        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(
                nameLabel, nameTextField,
                dateLabel, datePicker,
                calculateButton,
                resultLabel
        );

        // Ustawienie układu w scenie
        Scene scene = new Scene(vbox, 300, 200);

        // Wyświetlenie sceny
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

