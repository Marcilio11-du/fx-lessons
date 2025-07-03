package guiapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LessonFive extends Application {

    Stage window;
    Button btn;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
       window = primaryStage;
       btn = new Button("Clicar");
       btn.setOnAction(e -> System.out.println("O botão foi clicado!"));
       window.setTitle("Aplicação da aula número 5");

       StackPane layout = new StackPane();
       layout.getChildren().add(btn);
       Scene scene = new Scene(layout);
       window.setScene(scene);
       window.show();


    }
}
