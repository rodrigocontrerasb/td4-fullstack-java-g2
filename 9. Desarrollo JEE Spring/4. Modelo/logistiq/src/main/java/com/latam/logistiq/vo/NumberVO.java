package com.latam.logistiq.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class NumberVO extends GenericVO {
	
	long valor;

	public NumberVO(long valor, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.valor = valor;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}
	
	
	
}
