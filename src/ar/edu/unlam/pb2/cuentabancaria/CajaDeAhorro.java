package ar.edu.unlam.pb2.cuentabancaria;

public class CajaDeAhorro extends Cuenta {

	protected Integer cantidadDeExtraccion;
	protected static final Integer CANTIDAD_A_COBRAR_ADICIONAL = 5;
	protected static final Integer VALOR__A_COBRAR = 6;

	public CajaDeAhorro() {
		super();
		cantidadDeExtraccion = 0;

	}

	public void extraerD(Double valor) {
		if (cantidadDeExtraccion >= CANTIDAD_A_COBRAR_ADICIONAL) {
			valor += VALOR__A_COBRAR;
			if (getSaldo() >= valor) {
				super.extraerDinero(valor);
			}
		} else {
			if (getSaldo() >= valor) {
				super.extraerDinero(valor);
			}
			cantidadDeExtraccion++;

		}
	}

}
