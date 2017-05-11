package ar.edu.unlam.pb2.cuentabancaria;

import org.junit.Assert;
import org.junit.Test;

public class CuentaTest {

	@Test

	public void testQueDepositeSaldoCorrecto() {

		Cuenta miCuenta = new Cuenta();

		Boolean valorEsperado = true;
		Assert.assertEquals(valorEsperado, miCuenta.depositarDinero(500.0));

		Boolean valorEsperado2 = false;
		Assert.assertEquals(valorEsperado2, miCuenta.depositarDinero(-500.0));

	}

	@Test

	public void testQueExtraigaCorrectamente() {
		Cuenta miCuenta = new Cuenta();
		miCuenta.depositarDinero(5000.0);
		Assert.assertTrue(miCuenta.extraerDinero(500.0));
		Assert.assertFalse(miCuenta.extraerDinero(6000.0));

	}

	@Test

	public void testQueConsulteSaldo() {
		Cuenta miCuenta = new Cuenta();

		miCuenta.depositarDinero(100.0);
		Assert.assertEquals((Double) 100.0, miCuenta.getSaldo());

	}
}
