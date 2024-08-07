package com.etiya.intern.service;

import com.etiya.intern.entity.UserEntity;
import com.etiya.intern.entity.dto.UserDto;

import java.util.List;

public interface IUserService {
    List<UserEntity> getAllUser();

}
