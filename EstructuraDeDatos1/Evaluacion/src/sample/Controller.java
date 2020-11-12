package sample;

import Pez.Pez;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {
    @FXML TextField txtArreglo1;
    @FXML ListView lista1;
   @FXML ComboBox comboBox;


    @FXML public void initialize(){
       comboBox.getItems().addAll("Pez trucha", "Pez Carpa");
       ObservableList<String>variable= FXCollections.observableArrayList("datos");
       comboBox.setItems(variable);
   }

    public void salir(ActionEvent event){
        System.exit(0);


        int[][]arreglo1= new int[2][0];

    int cont=0;
    int cont1;
    Pez pez=new Pez();
    String [] peces=new String[3];
    public void procesar(ActionEvent event){
        Double.parseDouble(txtArreglo1.getText());
      //  lista1.getItems().add("pescado"+)
            double dato = Double.parseDouble(txtArreglo1.getText());
            lista1.getItems().add("Pescado "+peces [1]+" nacen "+dato+" por cría y "+peces[0]+
                    " al año, tenemos una perdida de: "+peces[2]);
            txtArreglo1.setText("");

        
    }




        }

        public void insertar1(ActionEvent event){
        if (txtArreglo1.getText().equals("")){

            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("INFROMACION");
            alert.setContentText("faltaron datos");
            alert.show();
        }else {
            double dato = Double.parseDouble(txtArreglo1.getText());
            double resto = (dato * .10);
            String Resto = String.valueOf(resto);
            String res = Pez.getPor_nacimiento(dato)+"";


            String[] peces =
            peces[1] = String.valueOf(comboBox.getValue().toString());
            peces[2] = Resto;


        }


    }
    public void imprimirarreglo(int [][]arre1){
      for (int x=0;x<arre1.length;x++){
          for (int y=0;y<arre1.length;y++){
          System.out.println(arre1[x][y] + ",");

        }
      }
        System.out.println("________________________");
    }//


}
