package ar.edu.unlam.pb2.cuentabancaria;

import org.junit.Assert;
import org.junit.Test;

public class CuentaSueldoTest {

	@Test
	public void testQueExtraigaCorrectamente() {

		CuentaSueldo miCuenta = new CuentaSueldo();

		miCuenta.depositarDinero(3000.0);
		miCuenta.extraer(2000.0);

		Double valorEsperado = 1000.0;
		Double valorObtenido = miCuenta.getSaldo();

		Assert.assertEquals(valorEsperado, valorObtenido);
		Assert.assertTrue(miCuenta.extraer(1000.0));
		Assert.assertFalse(miCuenta.extraer(3000.0));

		

	}

}
