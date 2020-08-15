package com.gkemayo.batch.dto;

import com.gkemayo.batch.entities.Supplier;
import com.gkemayo.batch.entities.Order;
import com.gkemayo.batch.entities.Product;
import com.gkemayo.batch.entities.Purchaser;
import com.gkemayo.batch.entities.PurchaseDate;

import lombok.Data;

@Data
public class ConvertedInputData {
	
	private Supplier supplier;
	
	private Purchaser purchaser;
	
	private Product product;
	
	private PurchaseDate purchaseDate;
	
	private Order order;

}
