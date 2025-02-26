package kte.ledemkam.restaurant.repository;

import kte.ledemkam.restaurant.domain.entities.Restaurant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface RestaurantRepository extends ElasticsearchRepository<Restaurant, String> {
    //custom query methods here
}
