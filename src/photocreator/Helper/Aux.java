/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photocreator.Helper;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author alumno
 */
public class Aux {
    
    public static String nombreFondo = "círculos", tipoBrillo, recogida;
    
    public static int precioFondo = 5, precioBrillo, precioRecogida;
    
    public static boolean aplicarDescuento;
    
    public static void AbrirResumen() throws IOException{
        Parent root = FXMLLoader.load(photocreator.PhotoCreator.class.getResource("Resumen/ResumenFXML.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setTitle("Resumen");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void AbrirDescuento() throws IOException{
        Parent root = FXMLLoader.load(photocreator.PhotoCreator.class.getResource("Descuento/DescuentoFXML.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Descuento");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void AbrirPedidos() throws IOException{
        Parent root = FXMLLoader.load(photocreator.PhotoCreator.class.getResource("Pedidos/PedidosFXML.fxml"));

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Mis pedidos");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
}
