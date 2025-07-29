package com.kiamisa.store.repositories;

import com.kiamisa.store.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
