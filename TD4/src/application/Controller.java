package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import modele.Produit;

public class Controller implements Initializable{
	@FXML
	public Pane pnl_fen;
	@FXML
	public VBox vbx_fen;
	@FXML
	public GridPane pnl_saisie;
	@FXML
	public Label lbl_nom;
	@FXML
	public Label lbl_desc;
	@FXML
	public Label lbl_tarif;
	@FXML
	public Label lbl_categ;
	@FXML
	public TextField txt_nom;
	@FXML
	public TextField txt_tarif;
	@FXML
	public Label lbl_comm;
	@FXML
	public TextArea txt_desc;
	@FXML
	public ChoiceBox<String> cbx_categ;
	@FXML
	public FlowPane pnl_bouton;
	@FXML
	public Button btn_creer;
	@FXML
	public FlowPane pnl_affich;
	@FXML
	public Label lbl_affi;

	// Event Listener on Button[#btn_creer].onAction
	@FXML
	public void creerModele(ActionEvent event) {
		Produit p=new Produit(this.txt_nom.getText(),this.txt_desc.getText(),Float.parseFloat(this.txt_tarif.getText()),this.cbx_categ.getSelectionModel().getSelectedItem());
		this.lbl_affi.setText(p.toString());
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.cbx_categ.getItems().add("Meuble");
		this.cbx_categ.getItems().add("Nourriture");
		this.cbx_categ.getItems().add("V�tements");
		this.cbx_categ.getSelectionModel().select(0);
		
	}
}
