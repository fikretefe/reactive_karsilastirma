package com.etiya.intern.converter;

import com.etiya.intern.entity.UserEntity;
import com.etiya.intern.entity.dto.UserDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserConverter {

    public List<UserDto> userEntityListConvertToUserDtoList(List<UserEntity> userEntityList){
        List<UserDto> userDtoList =new ArrayList<>();
        for (UserEntity userEntity : userEntityList){
            UserDto userDto = new UserDto(userEntity.getName());
            userDtoList.add(userDto);
        }
        return userDtoList;
    }

}
