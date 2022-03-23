package com.desafiolatam.sistema;

public class ServicioEnvioVerificoPedido extends ServicioEnvioPedido {

	public void enviarPedido() {
		System.out.println("Verifico Pedido");
		super.enviarPedido();
	}

}
