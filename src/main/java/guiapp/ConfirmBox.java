package guiapp;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class ConfirmBox {

    static boolean answer;

    public static boolean display(String title, String message) {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setMaxWidth(300);
        stage.setMinHeight(150);

        Label label = new Label(message);

        Button yButton = new Button("Yes");
        Button nButton = new Button("No");

        yButton.setOnAction(e -> {
           answer = true;
           stage.close();
        });

        nButton.setOnAction(e -> {
            answer = false;
            stage.close();
        });


        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, yButton, nButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
        return answer;
    }
}
