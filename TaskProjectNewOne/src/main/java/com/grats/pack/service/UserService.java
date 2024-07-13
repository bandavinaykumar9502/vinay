package com.grats.pack.service;

import com.grats.pack.entity.User;
import com.grats.pack.payLoad.UserDto;

public interface UserService {

	public User userDtoToUserEntity(UserDto userDto);
	public UserDto createUser(UserDto userDto);
}
