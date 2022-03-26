package com.latam.logistiq.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public abstract class Util {
	public static List<Integer> getArregloPaginas(Integer paginaSolicitada, Integer totalPaginas) {		
		Integer cantidadBotonesPaginador = 2;
		
		Integer inicioLista = (paginaSolicitada - cantidadBotonesPaginador) < 1 ? 1 : paginaSolicitada-cantidadBotonesPaginador;
		Integer finLista = (paginaSolicitada + cantidadBotonesPaginador) > totalPaginas ? totalPaginas : paginaSolicitada+cantidadBotonesPaginador;
		
		List<Integer> paginas = IntStream.rangeClosed(inicioLista , finLista)
				.boxed().collect(Collectors.toList());

		return paginas;
	}
}
