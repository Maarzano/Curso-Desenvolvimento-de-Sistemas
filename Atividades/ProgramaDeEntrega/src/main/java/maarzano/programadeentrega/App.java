package maarzano.programadeentrega;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("App-Front.fxml"));
        Image iconImage = new Image(getClass().getResourceAsStream("/maarzano/programadeentrega/ifood-43.png"));
        primaryStage.getIcons().add(iconImage);
        primaryStage.setTitle("Aplicativo de entrega");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}