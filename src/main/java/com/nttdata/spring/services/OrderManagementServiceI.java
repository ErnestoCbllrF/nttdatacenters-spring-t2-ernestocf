package com.nttdata.spring.services;


import com.nttdata.spring.repository.Order;
import com.nttdata.spring.repository.Products;

/**
 * Taller 2 Spring
 * 
 * Interfaz servicio gestión de pedidos
 * 
 * @author ernestocf
 *
 */
public interface OrderManagementServiceI {

	/**
	 * Crear pedidos
	 * 
	 * @param Id
	 * @param purchaser
	 * @param shipAdress
	 * @return
	 */
	public Order createOrder(Long id, String purchaser, String shipAddress);

	/**
	 * Añadir productos al pedido
	 * 
	 * @param product
	 */
	public void addProductsToOrder(Products product, Order order);

	/**
	 * Consulta de los datos del pedido
	 * 
	 * @param orders
	 */
	public void showOrder(Order orders);

	/**
	 * Cancelar el pedido
	 * 
	 * @param order
	 * @return
	 */
	public void cancelOrder(Order order);

}
