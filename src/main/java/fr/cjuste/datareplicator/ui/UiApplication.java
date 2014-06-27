package fr.cjuste.datareplicator.ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class UiApplication extends Application {

    @Override
    public void start(final Stage stage) throws Exception {
        stage.setTitle("Réplicateur de données");
        stage.centerOnScreen();

        Button btn = new Button("Hello world");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(final ActionEvent arg0) {
                System.out.println("Hello World");
            }
        });

        StackPane rootPane = new StackPane();
        rootPane.getChildren().add(btn);
        stage.setScene(new Scene(rootPane));
        stage.show();
    }

}
