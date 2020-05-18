package com.cg.anurag.b4.productstock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.anurag.b4.productstock.dao.ProductStockDAO;
import com.cg.anurag.b4.productstock.dto.ProductStock;
@Service
public class ProductStockService
{
	@Autowired
    ProductStockDAO psdao;
	public void setpsdao(ProductStockDAO psdao) { this.psdao=psdao;}
	 @Transactional
	    public ProductStock addStock(ProductStock productStock)
	    {
		 return psdao.save(productStock);
	    }
}
