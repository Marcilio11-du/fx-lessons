package exercises;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.util.concurrent.atomic.AtomicInteger;

public class InteractiveCounter extends Application {
    Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        AtomicInteger number = new AtomicInteger();
        stage = primaryStage;
        stage.setTitle("Contador Interativo");
        //Elementos visuais do Scene
        Button buttonIncrement = new Button("+ Incrementar");
        Button buttonDecrement = new Button("- Decrementar");
        Label value = new Label(String.valueOf(number.get()));

        buttonIncrement.setOnAction(e -> {
            value.setText(String.valueOf(number.getAndIncrement()));
        });
        buttonDecrement.setOnAction(e ->{
            value.setText(String.valueOf(number.getAndDecrement()));
        });

        value.setText(String.valueOf(number.get()));

        VBox container = new VBox(100);
        container.getChildren().addAll(value, buttonIncrement, buttonDecrement);
        container.setAlignment(Pos.CENTER);
        Scene scene = new Scene(container);
        stage.setScene(scene);
        stage.show();

    }
}
