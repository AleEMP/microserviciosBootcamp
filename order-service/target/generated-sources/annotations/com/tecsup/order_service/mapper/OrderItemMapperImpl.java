package com.tecsup.order_service.mapper;

import com.tecsup.order_service.dto.OrderItem;
import com.tecsup.order_service.entity.OrderItemEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-26T17:02:40-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class OrderItemMapperImpl implements OrderItemMapper {

    @Override
    public OrderItem toOrderItem(OrderItemEntity entity) {
        if ( entity == null ) {
            return null;
        }

        OrderItem orderItem = new OrderItem();

        orderItem.setId( entity.getId() );
        orderItem.setQuantity( entity.getQuantity() );
        orderItem.setUnitPrice( entity.getUnitPrice() );
        orderItem.setSubtotal( entity.getSubtotal() );

        return orderItem;
    }

    @Override
    public OrderItemEntity toOrderItemEntity(OrderItem dto) {
        if ( dto == null ) {
            return null;
        }

        OrderItemEntity orderItemEntity = new OrderItemEntity();

        orderItemEntity.setProductId( dtoProductId( dto ) );
        orderItemEntity.setQuantity( dto.getQuantity() );
        orderItemEntity.setUnitPrice( dto.getUnitPrice() );
        orderItemEntity.setSubtotal( dto.getSubtotal() );

        return orderItemEntity;
    }

    private Long dtoProductId(OrderItem orderItem) {
        if ( orderItem == null ) {
            return null;
        }
        OrderItem.ProductSummary product = orderItem.getProduct();
        if ( product == null ) {
            return null;
        }
        Long id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
