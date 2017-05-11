package ar.edu.unlam.pb2.cuentabancaria;

public class CuentaSueldo extends Cuenta {

	public CuentaSueldo() {
		super();
	}

	public Boolean extraer(Double valor) {
		if (getSaldo() >= valor) {
			super.extraerDinero(valor);
			return true;
		}
		return false;
	}

}
