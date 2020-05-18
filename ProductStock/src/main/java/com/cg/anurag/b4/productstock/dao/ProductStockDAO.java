package com.cg.anurag.b4.productstock.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.anurag.b4.productstock.dto.ProductStock;

@Repository
public interface ProductStockDAO extends JpaRepository<ProductStock,Integer>
{

}
