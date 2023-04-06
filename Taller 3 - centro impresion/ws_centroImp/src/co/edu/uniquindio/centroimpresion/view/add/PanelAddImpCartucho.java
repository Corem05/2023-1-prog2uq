package co.edu.uniquindio.centroimpresion.view.add;

import co.edu.uniquindio.centroimpresion.controllers.CtrlPanelAddImpCartucho;
import co.edu.uniquindio.centroimpresion.exceptions.CentroImpresionException;
import co.edu.uniquindio.centroimpresion.exceptions.FueraRangoException;
import co.edu.uniquindio.centroimpresion.exceptions.ObjectNotExists;
import co.edu.uniquindio.centroimpresion.exceptions.TextIsEmptyException;
import co.edu.uniquindio.centroimpresion.model.centro.EstadoImpresora;
import co.edu.uniquindio.centroimpresion.view.custom.PanelConVolver;
import co.edu.uniquindio.centroimpresion.view.custom.PanelMenuOpcionObjetos;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class PanelAddImpCartucho extends PanelConVolver {
	private PanelMenuOpcionObjetos panel;
	private VBox vBox;
	private Label btnAgregar;
	private TextField tfCode, tfMarca, tfVel, tfCapacidad, tfDesgaste, tfVelDecimal, tfCapacidadDecimal,
			tfDesgasteDecimal;

	public PanelAddImpCartucho(PanelMenuOpcionObjetos panel) {
		this.panel = panel;
	}

	public void initComp() {
		super.initComp();
		vBox = new VBox(20);
		tfCode = new TextField();
		tfMarca = new TextField();
		tfVel = new TextField();
		tfVelDecimal = new TextField();
		tfCapacidad = new TextField();
		tfCapacidadDecimal = new TextField();
		tfDesgaste = new TextField();
		tfDesgasteDecimal = new TextField();
		btnAgregar = new Label("Agregar Impresora");

		vBox.setId("centered-box");
		tfCode.setId("textfield");
		tfMarca.setId("textfield");
		tfVel.setId("textfield");
		tfCapacidad.setId("textfield");
		tfDesgaste.setId("textfield");
		btnAgregar.setId("btn");

		HBox.setMargin(tfVel, new Insets(0, 10, 0, 10));
		HBox.setMargin(tfVelDecimal, new Insets(0, 5, 0, 10));
		HBox.setMargin(tfCapacidad, new Insets(10, 10, 10, 10));
		HBox.setMargin(tfCapacidadDecimal, new Insets(0, 5, 0, 10));
		HBox.setMargin(tfDesgaste, new Insets(10, 10, 10, 10));
		HBox.setMargin(tfDesgasteDecimal, new Insets(0, 5, 0, 10));
		ComboBox<String> comboEstados = new ComboBox<String>();
		CheckBox checkColor = new CheckBox();

		comboEstados.setItems(FXCollections.observableArrayList(EstadoImpresora.stringValues()));

		vBox.getChildren().add(generarHBox("Escribe el c�digo de la impresora", tfCode));
		vBox.getChildren().add(generarHBox("Escribe la marca de la impresora", tfMarca));
		vBox.getChildren().add(generarHBox("Elige el estado de la impresora", comboEstados));
		vBox.getChildren().add(generarHBox("�La impresora es a color?"));
		vBox.getChildren().add(generarHBox(0, "Escribe la vel de la impresora (paginas por minuto)", tfVel,
				new Label(","), tfVelDecimal));
		vBox.getChildren().add(generarHBox(0, "Escribe la capacidad de cartucho de la impresora", tfCapacidad,
				new Label(","), tfCapacidadDecimal));
		vBox.getChildren().add(generarHBox(0, "Escribe el desgaste del cartucho de la impresora", tfDesgaste,
				new Label(","), tfDesgasteDecimal));

		BorderPane agregarCase = new BorderPane(btnAgregar);

		agregarCase.setId("btn-case");
		vBox.getChildren().add(agregarCase);
		setCenter(vBox);
		btnAgregar.setOnMouseReleased(event -> {});
	}

	@Override
	public void volverPresionado() {
		panel.initComp();
	}
}
