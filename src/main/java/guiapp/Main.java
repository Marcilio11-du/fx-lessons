package guiapp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("Clique aqui!"); //Inicializa um objeto Botão com o texto que vai aparecer em cima dele
        btn.setOnAction(e -> {
            System.out.println("JavaFX Funcionando!");
            btn.setText("Botão clicado!");
        }); //Programa o evento a ser realizado pelo botão ao ser clicado


        StackPane root = new StackPane(); //Cria um painel (área vazia) que organiza os componentes no centro (empilhados)
        root.getChildren().add(btn); //Adiciona o botão (btn) dentro do painel (root)

        Scene scene = new Scene(root, 500, 250); // Cria a cena (tela) com o painel (root) e define largura=500px e altura=250px
        primaryStage.setTitle("Meu App em Java"); //Coloca um título na janela
        primaryStage.setScene(scene); // Coloca a cena dentro da janela principal
        primaryStage.show(); // Abre a janela e exibe tudo
    }

    public static void main(String[] args) {
        launch(args);
    }
}