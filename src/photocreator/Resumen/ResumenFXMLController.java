/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photocreator.Resumen;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author alumno
 */
public class ResumenFXMLController implements Initializable {
    
    @FXML
    private Label nombreFondo,fondoPrecio, brilloPrecio, recogidaPrecio, total,lblDescuento, tipoDescuento; 
    
    @FXML
    private Button btnDescuento, btnFinalizar;
    
    private double precioTotal;
    
    private String fondoNombre = photocreator.Helper.Aux.nombreFondo;
    
    private int precioFondo = photocreator.Helper.Aux.precioFondo;
    
    private int precioBrillo = photocreator.Helper.Aux.precioBrillo;
    
    private int precioRecogida = photocreator.Helper.Aux.precioRecogida;
    
    @FXML
    private void btnDescuentoOnAction() throws IOException{
        photocreator.Helper.Aux.AbrirDescuento();
        System.out.println("algo");
        if(photocreator.Helper.Aux.aplicarDescuento == true){
            lblDescuento.setVisible(true);
            tipoDescuento.setVisible(true);
            precioTotal = precioTotal - precioTotal*0.1;
            total.setText(precioTotal + "€");
        }
    }
    
    @FXML
    private void radioAceptarOnAction(){
        btnFinalizar.setDisable(false);
    }
    
    @FXML
    private void btnFinalizarOnAction(){
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        nombreFondo.setText(fondoNombre);
        fondoPrecio.setText(precioFondo + "€");
        brilloPrecio.setText(precioBrillo + "€");
        recogidaPrecio.setText(precioRecogida + "€");
        precioTotal = precioBrillo + precioFondo + precioRecogida;
        total.setText(precioTotal + "€");
    }
}
