package guiapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LessonSix extends Application {

    Stage window;
    Button btn;

    public static void main(String[] args) {launch(args);}
    //Comentário aleatório

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        btn = new Button("Clicar");
        btn.setOnAction(e -> {
            boolean res = ConfirmBox.display("Menu","Tem a certeza de que pretende fechar a janela?");
            System.out.println(res);
        });
        window.setTitle("Aplicação da aula número 5");

        StackPane layout = new StackPane();
        layout.getChildren().add(btn);
        Scene scene = new Scene(layout, 500, 250);
        window.setScene(scene);
        window.show();
    }
}
