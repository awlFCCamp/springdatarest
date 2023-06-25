package com.AngelaCodes.spring.data.rest.repository;

import com.AngelaCodes.spring.data.rest.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,Long> {
}
