package guiapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LessonFour extends Application {

    Stage window;
    Scene scene, scene2;
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        Label label1 = new Label("Seja muito bem-vindo a primeira tela!!!");
        Button btn1 = new Button("Vá pra a segunda tela");
        btn1.setOnAction(e -> window.setScene(scene2));

        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1, btn1);
        scene = new Scene(layout1, 200, 200);

        Button btn2 = new Button("VOltar para a primeira tela");
        btn2.setOnAction(e -> window.setScene(scene));

        StackPane layout2 = new StackPane();
        layout2.getChildren().add(btn2);
        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene);
        window.setTitle("Teste Aqui");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}