package com.codeddecode.restaurantListing.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.codeddecode.restaurantListing.dto.RestaurantDTO;
import com.codeddecode.restaurantListing.entity.Restaurant;


@Mapper
public interface RestaurantMapper {
	RestaurantMapper INSTANCE= Mappers.getMapper(RestaurantMapper.class);
	Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO);
	RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant);
}