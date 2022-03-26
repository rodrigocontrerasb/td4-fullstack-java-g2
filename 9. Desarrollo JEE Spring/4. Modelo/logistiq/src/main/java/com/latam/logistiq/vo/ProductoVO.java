package com.latam.logistiq.vo;

import java.util.List;

import com.latam.logistiq.modelo.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProductoVO extends GenericVO {
	
	List<Producto> productos;

	public ProductoVO(List<Producto> productos, String mensaje, String codigo) {
		super(mensaje, codigo);
		this.productos = productos;
	}

	public ProductoVO() {
		// TODO Auto-generated constructor stub
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
