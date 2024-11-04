package com.freire.api.service;

import com.freire.api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
