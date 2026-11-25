package fr.lucas.particle_project.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 1. Le conteneur : un Pane vide, sans mise en page automatique.
        //    C'est dans lui qu'on ajoutera plus tard ce qu'il faut dessiner.
        Pane root = new Pane();

        // 2. La scène : elle contient le Pane, et la couleur passée en second
        //    argument remplit tout le fond de la fenêtre.
        Scene scene = new Scene(root, Color.BLACK);

        // 3. La fenêtre (Stage) : on lui donne la scène, on passe en plein écran, on l'affiche.
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }
}
