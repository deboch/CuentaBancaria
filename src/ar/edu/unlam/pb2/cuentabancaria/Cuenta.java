package ar.edu.unlam.pb2.cuentabancaria;

public class Cuenta {

	protected Double saldo;

	// Método constructor
	public Cuenta() {
		this.saldo = 0.0;
	}

	// Extraer plata

	public Boolean extraerDinero(Double valor) {
		if (saldo < valor) {
			return false;
		} else {
			this.saldo = saldo - valor;
			return true;
		}

	}

	// Depositar plata
	public Boolean depositarDinero(Double valor) {
		if (valor <= 0) {
			return false;

		} else
			this.saldo = saldo + valor;
		return true;
	}

	// Métodos getters and setters

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
}
