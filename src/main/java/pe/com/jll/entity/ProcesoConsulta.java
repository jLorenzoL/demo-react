package pe.com.jll.entity;

import java.util.Map;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ProcesoConsulta {
	
	private Map<String, String> respuestaServicio;
	private DataNoExisteExcepcion dataNoExisteExcepcion;

}
