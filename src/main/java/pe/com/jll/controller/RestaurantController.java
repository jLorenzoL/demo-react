package pe.com.jll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.jll.service.RestaurantService;
import pe.com.jll.utils.JsonManagerResponse;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/buscar")
    public Map<String, Object> getList(){
        try{
            return new JsonManagerResponse("Se ha procesado correctamente", true)
                    .buildResponse("restaurantes", restaurantService.getRestaurant()).getResponse();
        } catch (Exception e) {
            return JsonManagerResponse.procesoError(e).getResponse();
        }
    }
}
