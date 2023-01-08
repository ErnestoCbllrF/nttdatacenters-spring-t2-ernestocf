package com.nttdata.spring.services;

import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Order;
import com.nttdata.spring.repository.Products;

/**
 * Taller 2 Spring
 * 
 * Implementación servicio gestión de pedidos en peninsula
 * 
 * @author ernestocf
 *
 */
@Service("peninsularOrderService")
public class PeninsularOrderManagementImpl implements OrderManagementServiceI {

	@Override
	public Order createOrder(Long id, String purchaser, String shipAddress) {
		return new Order(id, purchaser, shipAddress);
	}

	@Override
	public void addProductsToOrder(Products product, Order order) {
		product.setPriceWithTaxes(product.getPriceWOTaxes() * 1.21f);
		order.addProduct(product);
	}

	@Override
	public void showOrder(Order order) {
		System.out.println("ID Pedido: " + order.getOrderId());
		System.out.println("Destinatario : " + order.getPurchaser());
		System.out.println("Dirección destinatario: " + order.getShipAddress());
		System.out.println("Productos : " + order.getProducts());
		System.out.println("Precio Total: " + order.getTotalPrice());
	}

	@Override
	public void cancelOrder(Order order) {
		order.deleteProducts();
		System.out.println("El pedido " + order.getOrderId() + " ha sido eliminado");
	}

}
