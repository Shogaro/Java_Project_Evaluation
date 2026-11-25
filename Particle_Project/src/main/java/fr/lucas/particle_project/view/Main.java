package fr.lucas.particle_project.view;

import fr.lucas.particle_project.model.Particle;
import fr.lucas.particle_project.model.ParticleCreation;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // 1. Le conteneur : un Pane vide, sans mise en page automatique.
        //    C'est dans lui qu'on ajoutera plus tard ce qu'il faut dessiner.
        Pane root = new Pane();
        Rectangle2D bounds = Screen.getPrimary().getBounds();
        ParticleCreation creation = new ParticleCreation(bounds.getWidth(), bounds.getHeight());

        for (Particle p : creation.getListOfParticles()) {
            root.getChildren().add(new Circle(p.getX(), p.getY(), Particle.RADIUS, Color.rgb(p.getR(), p.getG(), p.getB())));
        }
        // 2. La scène : elle contient le Pane, et la couleur passée en second
        //    argument remplit tout le fond de la fenêtre.
        Scene scene = new Scene(root, Color.BLACK);

        // 3. La fenêtre (Stage) : on lui donne la scène, on passe en plein écran, on l'affiche.
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.show();
    }
}
