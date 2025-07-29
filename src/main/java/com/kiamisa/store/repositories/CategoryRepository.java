package com.kiamisa.store.repositories;

import com.kiamisa.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Byte> {
}
