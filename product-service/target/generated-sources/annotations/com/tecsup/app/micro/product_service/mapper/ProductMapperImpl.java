package com.tecsup.app.micro.product_service.mapper;

import com.tecsup.app.micro.product_service.dto.Product;
import com.tecsup.app.micro.product_service.entity.ProductEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-22T20:54:24-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251001-1143, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toDomain(ProductEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Product product = new Product();

        product.setCategory( entity.getCategory() );
        product.setDescription( entity.getDescription() );
        product.setId( entity.getId() );
        product.setName( entity.getName() );
        product.setPrice( entity.getPrice() );
        product.setStock( entity.getStock() );

        return product;
    }

    @Override
    public ProductEntity toEntity(Product domain) {
        if ( domain == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setCategory( domain.getCategory() );
        productEntity.setDescription( domain.getDescription() );
        productEntity.setId( domain.getId() );
        productEntity.setName( domain.getName() );
        productEntity.setPrice( domain.getPrice() );
        productEntity.setStock( domain.getStock() );

        return productEntity;
    }
}
