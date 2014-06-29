package fr.cjuste.datareplicator.ui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;


public class UiApplication extends Application {

    private static final String TITLE = "Réplicateur de données";

    @Override
    public void start(final Stage stage) throws Exception {
        stage.setTitle(TITLE);
        stage.centerOnScreen();

        Button btn = new Button("Select file");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(final ActionEvent arg0) {
                DirectoryChooser chooser = new DirectoryChooser();
                chooser.setTitle(TITLE);
                File defaultDirectory = new File("c:/");
                chooser.setInitialDirectory(defaultDirectory);
                File file = chooser.showDialog(stage);
            }
        });

        StackPane rootPane = new StackPane();
        rootPane.getChildren().add(btn);
        stage.setScene(new Scene(rootPane, 400, 300));
        stage.show();
    }

}
