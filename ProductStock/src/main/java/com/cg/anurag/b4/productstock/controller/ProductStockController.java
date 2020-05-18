package com.cg.anurag.b4.productstock.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.anurag.b4.productstock.dto.ProductStock;
import com.cg.anurag.b4.productstock.exceptions.StockNotFoundException;
import com.cg.anurag.b4.productstock.service.ProductStockService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController 
public class ProductStockController
{
	@Autowired
	ProductStockService productStockService;
	public void setProductStockService(ProductStockService productStockService)
	{
		this.productStockService=productStockService;
	}
   @PostMapping(value="productstock/addstock",consumes="application/json")
   public ResponseEntity<String> addStock(@RequestBody()ProductStock productStock)
   {
	   String message=null;
	   if(productStockService.addStock(productStock)==null) {
		   message="Stock Insertion Failed";
	   return new ResponseEntity<String>(message,HttpStatus.BAD_REQUEST);
	   
	   }
	   else {
		   message="Stock Inserted Successfully";
		   return new ResponseEntity<String>(message,HttpStatus.OK);
	   }
   }
   
  

   
  
}