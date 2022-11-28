/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photocreator.Pedidos;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * FXML Controller class
 *
 * @author fullerd3v
 */
public class PedidosFXMLController implements Initializable {
    
    @FXML
    private TableView tblPedidos;
    
    @FXML
    private TableColumn colPedido, colImporte;
    
    @FXML
    private Button btnSalir;
    
    @FXML
    private void btnSalirOnAction(){
        Stage stage = (Stage) btnSalir.getScene().getWindow();        
        stage.setOnCloseRequest(e -> Platform.exit());
        stage.fireEvent(new WindowEvent(stage, WindowEvent.WINDOW_CLOSE_REQUEST));
    }
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
