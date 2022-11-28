/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photocreator.Descuento;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author alumno
 */
public class DescuentoFXMLController implements Initializable {
    
    @FXML
    private Button btnAceptar;
    
    @FXML
    private TextField txtDescuento;
    
    @FXML
    private void btnAceptarOnAction() throws IOException{
        if("C10".equals(txtDescuento.getText())){
            photocreator.Helper.Aux.aplicarDescuento = true;
        }
        
        Stage stage = (Stage) btnAceptar.getScene().getWindow();
        stage.close();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
