/*
 * Форма чата с разметкой на GridPane
 * На TextArea добавлен вертикальный скрол, и wrap-text для длинных строк
 * 
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 *
 * @author Gerasimov V. Gerasim
 */
public class Main extends Application {
    
    
    @Override
    public void start(Stage stage) throws Exception {
         
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml")); 
        Scene scene = new Scene(root, 400,400);
         
        stage.setScene(scene);
        stage.setTitle("JavaFX Chat UI Prototype ;-)");
        stage.show();
    }
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
