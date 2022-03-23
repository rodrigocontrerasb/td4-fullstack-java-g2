package com.desafiolatam.sistema;

public class ServicioComidaDomicilio {

	/*
	 * public void enviar() { System.out.println("Registrar pedido");
	 * System.out.println("Cobrar Pedido"); System.out.println("Enviar pedido"); }
	 */

	ServicioRegistroPedido servicio_registro;
	ServicioCobroPedido servicio_cobro;
	ServicioEnvioPedido servicio_envio;

	public ServicioComidaDomicilio() {
		this.servicio_registro = new ServicioRegistroPedido();
		this.servicio_cobro = new ServicioCobroPedido();
		this.servicio_envio = new ServicioEnvioPedido();
	}

	public void enviar() {
		servicio_registro.registrarPedido();
		servicio_cobro.cobrarPedido();
		servicio_envio.enviarPedido();
	}

	public ServicioComidaDomicilio(ServicioRegistroPedido servicio_registro, ServicioCobroPedido servicio_cobro,
			ServicioEnvioPedido servicio_envio) {
		super();
		this.servicio_registro = servicio_registro;
		this.servicio_cobro = servicio_cobro;
		this.servicio_envio = servicio_envio;
	}
	
	
	

}
