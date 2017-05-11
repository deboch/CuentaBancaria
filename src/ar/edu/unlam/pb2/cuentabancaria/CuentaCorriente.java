package ar.edu.unlam.pb2.cuentabancaria;

public class CuentaCorriente extends Cuenta {

	protected Double giro_en_descubierto;
	protected static final Double PORCENTAJE = 0.05;

	// Constructor
	public CuentaCorriente() {
		super();

	}

	// Métodos getters and setters

	public Double getGiro_en_descubierto() {
		return giro_en_descubierto;
	}

	public void setGiro_en_descubierto(Double giro_en_descubierto) {
		if (giro_en_descubierto > 0.0) {
			this.giro_en_descubierto = giro_en_descubierto;
		}

	}

	// Métodos

	public void restarDescubierto(Double giro_en_descubiertoA_restar) {
		this.giro_en_descubierto -= giro_en_descubiertoA_restar;
	}

	public void extraer(Double valor) {

		if (getSaldo() >= valor) {
			super.extraerDinero(valor);
		} else {

			Double descubiertoQueUso = valor - getSaldo();
			Double porcentaje = descubiertoQueUso * PORCENTAJE;
			if ((getSaldo() + giro_en_descubierto) + porcentaje >= valor) {

				restarDescubierto(descubiertoQueUso + porcentaje);

				super.extraerDinero(super.getSaldo());
			}
		}
	}

}
