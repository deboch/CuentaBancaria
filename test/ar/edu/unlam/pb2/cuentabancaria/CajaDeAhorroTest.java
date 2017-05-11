package ar.edu.unlam.pb2.cuentabancaria;

import org.junit.Assert;
import org.junit.Test;

public class CajaDeAhorroTest {

	@Test
	public void testQueExtraigaDineroSinSuperarLasCincoVeces() {

		CajaDeAhorro miCuenta = new CajaDeAhorro();
		miCuenta.depositarDinero(5000.0);
		miCuenta.extraerD(1000.0);

		miCuenta.extraerD(1000.0);

		Double valorEsperado = 3000.0;

		Double ValorObtenido = miCuenta.getSaldo();

		Assert.assertEquals(valorEsperado, ValorObtenido);
	}

	@Test
	public void testQueExtraigaDineroSuperandoLasCincoVeces() {
		CajaDeAhorro miCuenta = new CajaDeAhorro();

		miCuenta.depositarDinero(8000.0);

		miCuenta.extraerD(1000.0);
		miCuenta.extraerD(1000.0);
		miCuenta.extraerD(1000.0);
		miCuenta.extraerD(1000.0);
		miCuenta.extraerD(1000.0);
		miCuenta.extraerD(1000.0);
		miCuenta.extraerD(1000.0);

		Double valorEsperado = 988.0;

		Double ValorObtenido = miCuenta.getSaldo();

		Assert.assertEquals(valorEsperado, ValorObtenido);

	}
}
