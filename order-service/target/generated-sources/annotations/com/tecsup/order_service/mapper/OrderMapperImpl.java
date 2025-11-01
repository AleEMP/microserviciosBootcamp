package com.tecsup.order_service.mapper;

import com.tecsup.order_service.client.User;
import com.tecsup.order_service.dto.Order;
import com.tecsup.order_service.dto.OrderItem;
import com.tecsup.order_service.entity.OrderEntity;
import com.tecsup.order_service.entity.OrderItemEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-26T17:02:40-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Autowired
    private OrderItemMapper orderItemMapper;

    @Override
    public Order toOrder(OrderEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( entity.getId() );
        order.setOrderNumber( entity.getOrderNumber() );
        order.setStatus( entity.getStatus() );
        order.setTotalAmount( entity.getTotalAmount() );
        order.setCreatedAt( entity.getCreatedAt() );
        order.setItems( orderItemEntityListToOrderItemList( entity.getItems() ) );

        return order;
    }

    @Override
    public OrderEntity toOrderEntity(Order dto) {
        if ( dto == null ) {
            return null;
        }

        OrderEntity orderEntity = new OrderEntity();

        orderEntity.setUserId( dtoUserId( dto ) );
        orderEntity.setId( dto.getId() );
        orderEntity.setOrderNumber( dto.getOrderNumber() );
        orderEntity.setStatus( dto.getStatus() );
        orderEntity.setTotalAmount( dto.getTotalAmount() );
        orderEntity.setCreatedAt( dto.getCreatedAt() );
        orderEntity.setItems( orderItemListToOrderItemEntityList( dto.getItems() ) );

        return orderEntity;
    }

    protected List<OrderItem> orderItemEntityListToOrderItemList(List<OrderItemEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderItem> list1 = new ArrayList<OrderItem>( list.size() );
        for ( OrderItemEntity orderItemEntity : list ) {
            list1.add( orderItemMapper.toOrderItem( orderItemEntity ) );
        }

        return list1;
    }

    private Long dtoUserId(Order order) {
        if ( order == null ) {
            return null;
        }
        User user = order.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected List<OrderItemEntity> orderItemListToOrderItemEntityList(List<OrderItem> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderItemEntity> list1 = new ArrayList<OrderItemEntity>( list.size() );
        for ( OrderItem orderItem : list ) {
            list1.add( orderItemMapper.toOrderItemEntity( orderItem ) );
        }

        return list1;
    }
}
