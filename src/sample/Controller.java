package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {
  @FXML
    TextField txtedad;
  @FXML
    JLabel lbltitulo;
  public void evento1 (ActionEvent EVENT){
     int dias= Integer.parseInt(txtedad.getText()*365);
      lbltitulo.setText("has vivido"+ dias);

  }
}
