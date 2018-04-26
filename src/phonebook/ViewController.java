package phonebook;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;


/**
 *
 * @author vikk
 */
public class ViewController implements Initializable {
  
  //<editor-fold defaultstate="collapsed" desc="FXML variable">
  @FXML
  private Label label;
  @FXML
          TableView table;
  @FXML
          Pane kontactPane;
  @FXML
          Pane exportPane;
  @FXML
          StackPane MenuPane;
  @FXML
          TextField inputLastName;
  @FXML
          TextField inputFirstName;
  @FXML
          TextField inputEmail;
  @FXML
          Button addNewContactButton;
//</editor-fold>
  
  
  private final ObservableList<Person> data =
          FXCollections.observableArrayList(
          new Person("Romzsa","Gyula","gyusziromzsa@gmail.com"),
          new Person("Bourne","Jason","secret@scret.com"),
          new Person("Lindinger","Judit","iriszeniko@citromail.hu"));
  
  
  @FXML
  private void handleButtonAction(ActionEvent event){
    
  }
  
  @Override
  public void initialize(URL url, ResourceBundle rb){
    TableColumn lastNameCol = new TableColumn("Vezetéknév");
    lastNameCol.setMinWidth(100);  
    lastNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
    lastNameCol.setCellValueFactory(new PropertyValueFactory<Person,String>("lastName"));
    
    TableColumn firstNameCol = new TableColumn("Keresztnév");
    firstNameCol.setMinWidth(100);
    firstNameCol.setCellFactory(TextFieldTableCell.forTableColumn());
    firstNameCol.setCellValueFactory(new PropertyValueFactory<Person,String>("firstName"));
    
    TableColumn emailCol = new TableColumn("Email cím");
    emailCol.setMinWidth(200);
    emailCol.setCellFactory(TextFieldTableCell.forTableColumn());
    emailCol.setCellValueFactory(new PropertyValueFactory<Person,String>("email"));
    
    table.getColumns().addAll(lastNameCol,firstNameCol,emailCol);
    table.setItems(data);
  }
   
}
