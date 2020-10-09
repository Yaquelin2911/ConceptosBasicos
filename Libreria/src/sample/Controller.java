package sample;

import Conversiones.Cconversion;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import jdk.dynalink.linker.ConversionComparator;

import javax.swing.*;

public class Controller {
  @FXML
    TextField txtedad;
  @FXML
    JLabel lbltitulo;
  public void evento1 (ActionEvent EVENT){
      Cconversion td=new Cconversion();
      
     int numero= Integer.parseInt(txtedad.getText());
     String res=td.binario(numero);
      lbltitulo.setText(res);

  }
}
