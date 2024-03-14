package co.edu.uniquindio.parcial1fx.parcial1fx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial1fx.parcial1fx.factory.ModelFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class TransportadoraController {

    ModelFactory modelFactory;

    @FXML
    void initialize() {
        modelFactory = ModelFactory.getInstance();
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregarPropietario;

    @FXML
    private Button btnUsuariosMayoresEdad;

    @FXML
    private TextField txtCedulaPropietario;

    @FXML
    private TextField txtCelularPropietario;

    @FXML
    private TextField txtEmailPropietario;

    @FXML
    private TextField txtNombrePropietario;

    @FXML
    private TextArea txtResultadoBusquedas;

    @FXML
    void onAgregarPropietario(ActionEvent event) {

    }

    @FXML
    void onCantidadUsuariosMayoresEdad(ActionEvent event) {
        obtenerMayoresdeEdad();
    }

    private void obtenerMayoresdeEdad() {
        String resultado = modelFactory.obtenerUsuariosMayoresDeEdad();
        txtResultadoBusquedas.setText(resultado);
    }


}
