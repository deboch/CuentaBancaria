package ar.edu.unlam.pb2.cuentabancaria;

import org.junit.Test;

import junit.framework.Assert;

public class CuentaCorrienteTest {

	@Test
	public void testQueExtraigaSinSuperarElGiro() {

		CuentaCorriente miCuenta = new CuentaCorriente();
		miCuenta.depositarDinero(4000.0);
		miCuenta.setGiro_en_descubierto(150.0);

		miCuenta.extraer(3000.0);

		Double valorObtenido = miCuenta.getSaldo();
		Double valorEsperado = 1000.0;

		Assert.assertEquals(valorObtenido, valorEsperado);
	}

	@Test
	public void testQueExtraigaSuperandoElGiro() {

		CuentaCorriente miCuenta = new CuentaCorriente();
		miCuenta.depositarDinero(100.0);
		miCuenta.setGiro_en_descubierto(150.0);
		miCuenta.extraer(200.0);

		Double saldo = miCuenta.getSaldo();
		Double descubierto = miCuenta.getGiro_en_descubierto();
		Assert.assertEquals(0.0, saldo, 0.1);
		Assert.assertEquals(45.0, descubierto, 0.1);
	}
}
