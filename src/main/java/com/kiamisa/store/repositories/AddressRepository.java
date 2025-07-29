package com.kiamisa.store.repositories;

import com.kiamisa.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
