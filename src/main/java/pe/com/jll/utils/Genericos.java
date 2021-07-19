package pe.com.jll.utils;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Genericos {

	private Genericos() {}
	
	public static<T> void ejecutarAcciones(List<Consumer<T>> consumidores, Predicate<T> condicion, Consumer<Exception> accionError) {
		
		try {
			for(Consumer<T> consumidor : consumidores) {
				consumidor.accept(null);
				if(condicion.test(null)) {
					break;
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			accionError.accept(e);
		}
		
	}
}
