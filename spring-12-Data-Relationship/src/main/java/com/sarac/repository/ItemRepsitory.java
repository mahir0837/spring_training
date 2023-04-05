package com.sarac.repository;

import com.sarac.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepsitory extends JpaRepository<Item,Long> {
}
