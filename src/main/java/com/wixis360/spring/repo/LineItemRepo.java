package com.wixis360.spring.repo;

import com.wixis360.spring.entity.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineItemRepo extends JpaRepository<LineItem,String> {
}
