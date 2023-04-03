package co.edu.uniquindio.centroimpresion.view.print;

import co.edu.uniquindio.centroimpresion.view.custom.PanelConVolver;
import co.edu.uniquindio.centroimpresion.view.custom.PanelMenuOpcionObjetos;

public class PanelPrintEspDoc extends PanelConVolver {
	private PanelMenuOpcionObjetos panel;

	public PanelPrintEspDoc(PanelMenuOpcionObjetos panel) {
		this.panel = panel;
	}

	@Override
	public void volverPresionado() {
		panel.initComp();
	}
}
