package com.springboot.relationship.data.repository.support;

import com.springboot.relationship.data.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Long> {
}
