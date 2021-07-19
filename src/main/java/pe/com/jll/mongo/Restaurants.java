package pe.com.jll.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "restaurants")
public class Restaurants {
	
	private String _id;
	private Address address;
	private String borough;
	private String cuisine;
	private String name;
	private String restaurant_id;

}
