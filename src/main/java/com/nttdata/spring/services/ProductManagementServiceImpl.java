package com.nttdata.spring.services;

import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Products;

/**
 * Taller 2 Spring
 * 
 * Implementación servicio gestión de productos
 * 
 * @author ernestocf
 *
 */
@Service
public class ProductManagementServiceImpl implements ProductManagementServiceI{
	@Override
	public Products addProduct(Long id, String productName, float priceWOTaxes) {
		Products newProducts = new Products();
		newProducts.setProductId(id);
		newProducts.setProductName(productName);
		newProducts.setPriceWOTaxes(priceWOTaxes);
		return newProducts;
	}

}
