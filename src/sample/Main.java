//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    public Main() {
    }

    public void start(Stage primaryStage) {
        try {
            VBox e = (VBox)FXMLLoader.load(this.getClass().getResource("neuralenetworks.fxml"));
            Scene scene = new Scene(e, 400.0D, 400.0D);
            scene.getStylesheets().add(this.getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception var4) {
            var4.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
