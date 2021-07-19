package pe.com.jll.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import pe.com.jll.mongo.Restaurants;

import java.util.List;

@Repository
public class RestaurantRepository {

	@Autowired
	MongoTemplate mongoTemplate;
	
	public RestaurantRepository(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	public List<Restaurants> getRestaurant(){
		return mongoTemplate.findAll(Restaurants.class);
	}
	
}
