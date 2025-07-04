package guiapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.plaf.basic.BasicButtonUI;

public class LessonSeven extends Application {

    Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        stage.setTitle("A forma correta de fechar uma janela");
        stage.setOnCloseRequest(e -> {
            e.consume();//O método consume() é usado para "consumir" um evento, indicando que ele não deve ser processado por outros handlers na cadeia de eventos
            boolean res = ConfirmBox.display("Fechar Janela", "Tem a certeza de que pretende fechar o programa");
            if(res)
                closeProgram();
        });
        Button  button = new Button("Fechar Janela");
        button.setOnAction(e -> closeProgram());
        StackPane root = new StackPane();
        root.getChildren().add(button);
        Scene scene = new Scene(root, 500, 250);
        stage.setScene(scene);
        stage.show();
    }

    private void closeProgram() {
        System.out.println("Programa encerrado");
        stage.close();
    }
}
