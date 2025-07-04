package guiapp;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class AlertBox {

    public static void display(String title, String message) {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        Label label = new Label(message);
        Button button = new Button("Fechar Janela");
        button.setOnAction(e -> stage.close());

        StackPane layout = new StackPane();
        layout.getChildren().addAll(label,button);
        Scene scene = new Scene(layout, 300,150);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
}
