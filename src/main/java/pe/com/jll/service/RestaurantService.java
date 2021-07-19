package pe.com.jll.service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import pe.com.jll.mongo.Restaurants;
import pe.com.jll.repository.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepository;
	
	public Map<String, String> consultarData(){
		
		//redicate<Void> condicionFn = value -> !Objects.isNull(obj);
		
		return null;
		
	}

	public List<Restaurants> getRestaurant(){
		return restaurantRepository.getRestaurant();
	}

}
