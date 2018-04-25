/*
 * This brogram is a Phone book sever
 */
package phonebook;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *  2018.04.24.
 * @author vikk
 */
public class PhoneBook extends Application {
  
  @Override
  public void start(Stage stage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
    
    Scene scene = new Scene(root);
    
    stage.setTitle("Telefonkönyv");
    stage.setWidth(600);
    stage.setHeight(690);
    stage.setScene(scene);
    stage.show();
  }

  
  public static void main(String[] args) {
    launch(args);
  }
  
}
