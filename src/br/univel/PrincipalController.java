package br.univel;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrincipalController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txfCodigo;

    @FXML
    private TextField txfNome;

    @FXML
    void salvar(ActionEvent event) {
    	

    }

    @FXML
    void initialize() {
        assert txfCodigo != null : "fx:id=\"txfCodigo\" was not injected: check your FXML file 'Principal.fxml'.";
        assert txfNome != null : "fx:id=\"txfNome\" was not injected: check your FXML file 'Principal.fxml'.";

    }

	@FXML public void salvar() {
		String codigo = txfCodigo.getText();
    	String nome = txfNome.getText();
    	
    	System.out.println(codigo + "\t" + nome);
	}
}
