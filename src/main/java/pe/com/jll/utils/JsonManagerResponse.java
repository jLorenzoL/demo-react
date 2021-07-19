package pe.com.jll.utils;

import java.util.HashMap;
import java.util.Map;

public class JsonManagerResponse {

    private Map<String, Object> response = new HashMap<>();

    public JsonManagerResponse(String mensaje, boolean estado) {
        response.put("mensaje", mensaje);
        response.put("estado", estado);
    }

    public static JsonManagerResponse procesoCorrecto(){
        return new JsonManagerResponse("Se ha procesado correctamente", Boolean.TRUE);
    }

    public static JsonManagerResponse procesoError(Exception e){
        return new JsonManagerResponse(e.getMessage(), Boolean.FALSE);
    }

    public static JsonManagerResponse procesoError(String mensaje){
        return new JsonManagerResponse(mensaje, Boolean.FALSE);
    }

    public Map<String, Object> getResponse(){
        return response;
    }

    public JsonManagerResponse buildResponse(String name, Object value){
        response.put(name, value);
        return this;
    }

    public JsonManagerResponse buildResponse(Map<String, Object> response){
        this.response.putAll(response);
        return this;
    }

    public JsonManagerResponse buildResponse(Map<String, Object> response, String mensaje){
        this.response.putAll(response);
        this.response.put("mensaje", mensaje);
        return this;
    }

}
