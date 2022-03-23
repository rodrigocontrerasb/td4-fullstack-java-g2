package com.desafiolatam.sistema;

public class Main {

	public static void main(String[] args) {
		/*
		 * ServicioComidaDomicilio servicio = new ServicioComidaDomicilio();
		 * servicio.enviar();
		 */

		ServicioComidaDomicilio servicio = new ServicioComidaDomicilio(new ServicioRegistroPedido(),
				new ServicioCobroPedido(), new ServicioEnvioVerificoPedido());

		servicio.enviar();
	}

}
