package com.tecsup.app.micro.product_service.service;

import com.tecsup.app.micro.product_service.client.User;
import com.tecsup.app.micro.product_service.client.UserClient;
import com.tecsup.app.micro.product_service.dto.Product;
import com.tecsup.app.micro.product_service.entity.ProductEntity;
import com.tecsup.app.micro.product_service.mapper.ProductMapper;
import com.tecsup.app.micro.product_service.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper mapper;
    private final UserClient userClient;


    public Product getUserById(Long id){

        ProductEntity productEntity = productRepository.findById(id).orElse(null);

        User user = userClient.getUserById(productEntity.getCreatedBy());
        log.info(" User : {}", user);

        return  mapper.toDomainWithUser(productEntity,user);
    }

}