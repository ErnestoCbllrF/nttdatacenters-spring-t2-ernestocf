package com.nttdata.spring.services;

import com.nttdata.spring.repository.Products;

/**
 * Taller 2 Spring
 * 
 * Interfaz servicio gestión de productos
 * 
 * @author ernestocf
 *
 */
public interface ProductManagementServiceI{
	/**
	 * Crear producto genérico sin impuestos
	 * 
	 * @param id
	 * @param productName
	 * @param priceWOTaxes
	 * @return
	 */
	public Products addProduct(Long id, String productName, float priceWOTaxes);
}
