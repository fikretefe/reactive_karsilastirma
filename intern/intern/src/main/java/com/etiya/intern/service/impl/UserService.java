package com.etiya.intern.service.impl;
import com.etiya.intern.converter.UserConverter;
import com.etiya.intern.entity.UserEntity;
import com.etiya.intern.entity.dto.UserDto;
import com.etiya.intern.repository.UserRepository;
import com.etiya.intern.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserConverter userConverter;

    @Override
    public List<UserEntity> getAllUser() {
        List<UserEntity> userEntityList = userRepository.findAll();
        if (CollectionUtils.isEmpty(userEntityList)){
            throw new RuntimeException("Empty Table");
        }
        return userEntityList;

    }
}
