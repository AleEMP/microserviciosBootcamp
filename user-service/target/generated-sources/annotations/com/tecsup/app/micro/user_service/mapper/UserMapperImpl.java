package com.tecsup.app.micro.user_service.mapper;

import com.tecsup.app.micro.user_service.dto.User;
import com.tecsup.app.micro.user_service.entity.UserEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-22T20:54:25-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251001-1143, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toDomain(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        User user = new User();

        user.setAddress( entity.getAddress() );
        user.setEmail( entity.getEmail() );
        user.setId( entity.getId() );
        user.setName( entity.getName() );
        user.setPhone( entity.getPhone() );

        return user;
    }

    @Override
    public UserEntity toEntity(User domain) {
        if ( domain == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setAddress( domain.getAddress() );
        userEntity.setEmail( domain.getEmail() );
        userEntity.setId( domain.getId() );
        userEntity.setName( domain.getName() );
        userEntity.setPhone( domain.getPhone() );

        return userEntity;
    }

    @Override
    public List<User> toDomain(List<UserEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( entities.size() );
        for ( UserEntity userEntity : entities ) {
            list.add( toDomain( userEntity ) );
        }

        return list;
    }
}
