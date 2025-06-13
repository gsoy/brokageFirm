package com.gsoy.brokagefirm.repository;

import com.gsoy.brokagefirm.model.dto.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findByEmail(String email);

}
