/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photocreator.Main;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import photocreator.PhotoCreator;

/**
 *
 * @author alumno
 */
public class MainFXMLController implements Initializable {
    
    @FXML
    private TextField txtNombre;
    
    @FXML
    private CheckBox checkBrillo;
    
    @FXML
    private ChoiceBox chbox;
    
    @FXML
    private Button btnSiguiente, btnVerDiseno;
    
    @FXML
    private RadioButton radioCirculo, radioRayas;
    
    @FXML 
    private ImageView img;
    
    @FXML
    private Label lblNombre;
    
    @FXML
    private Slider sliderBrillo;
    
    private String fondo, opt;
    
    Glow glow = new Glow();
    
    @FXML
    private void txtNombreOnKeyReleased(){
        lblNombre.setText(txtNombre.getText());
    }
    @FXML
    private void txtNombreOnKeyTyped(){}
    @FXML
    private void checkBriloOnAction(){
        img.setEffect(glow);
    }    
    @FXML
    private void sliderBrilloOnMouseDragged(){
        glow.setLevel(0.1*sliderBrillo.getValue());
        if(checkBrillo.isSelected()){
            photocreator.Helper.Aux.precioBrillo = 3;
            img.setEffect(glow);
        }else{
            photocreator.Helper.Aux.precioBrillo = 0;
            img.setEffect(null);
        }
    }
    
    @FXML
    private void radioCirculosOnAction(){
        fondo = "Resources/puntos.png";
        photocreator.Helper.Aux.precioFondo = 5;
        photocreator.Helper.Aux.nombreFondo = "círculos";
        ColocarFondo();
    }
    @FXML
    private void radioRayasOnAction(){
        fondo = "Resources/rayas.png";
        photocreator.Helper.Aux.precioFondo = 7;
        photocreator.Helper.Aux.nombreFondo = "rayas";
        ColocarFondo();
    }
    
    @FXML
    private void btnVerDisenoOnAction(){
        img.setVisible(true);
    }
    
    @FXML
    private void btnSiguienteOnAction() throws IOException {
        
        
        opt = chbox.getValue().toString();
        switch(opt){
            case "Casa":
                photocreator.Helper.Aux.precioRecogida = 8;
                break;
            case "Almacén":
                photocreator.Helper.Aux.precioRecogida = 0;
                break;
            case "Punto de recogida":
                photocreator.Helper.Aux.precioRecogida = 4;
                break;
        }
        
        photocreator.Helper.Aux.AbrirResumen();
        
        Stage stage = (Stage) btnSiguiente.getScene().getWindow();
        stage.close();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        chbox.setValue("Elegir una opción");
        chbox.getItems().add("Elegir una opción");
        chbox.getItems().add("Casa");
        chbox.getItems().add("Almacén");
        chbox.getItems().add("Punto de recogida");
    }
    
    private void ColocarFondo(){        
        Image imgFondo = new Image(PhotoCreator.class.getResource(fondo).toString());
        img.setImage(imgFondo);        
    }
    
}
