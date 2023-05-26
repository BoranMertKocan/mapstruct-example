package com.bmk.mapstructexample.mapper;

import com.bmk.mapstructexample.configuration.MappingConfiguration;
import com.bmk.mapstructexample.domain.dto.response.OrderResponse;
import com.bmk.mapstructexample.domain.model.Order;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

@Mapper(config = MappingConfiguration.class, uses = BookToBookResponseMapper.class)
public interface OrderResponseMapper extends Converter<Order, OrderResponse> {
}
