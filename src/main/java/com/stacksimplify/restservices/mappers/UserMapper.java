package com.stacksimplify.restservices.mappers;

import java.util.List;


import com.stacksimplify.restservices.dtos.UserMsDto;
import com.stacksimplify.restservices.entities.User;
import org.springframework.web.bind.annotation.Mapping;

@Mapper(componentModel = "Spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    //User To UserMsDto
    @Mappings({
            @Mapping(source= "email", target="emailaddress"),
            @Mapping(source = "role", target="rolename")
    })
    UserMsDto userToUserMsDto(User user);

    //List<User> to List<UserMsDto>
    List<UserMsDto> usersToUserDtos(List<User> users);

}
