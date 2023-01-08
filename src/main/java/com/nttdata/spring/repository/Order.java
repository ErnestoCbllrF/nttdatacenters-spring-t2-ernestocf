package com.nttdata.spring.repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Taller 2 Spring
 * 
 * Clase Pedido
 * 
 * @author ernestocf
 *
 */
public class Order {
	/** ID pedidos */
	private Long orderId;

	/** Destinatario */
	private String purchaser;

	/** Dirección de entrega */
	private String shipAddress;

	/** Booleano peninsula */
	private boolean onPeninsula;

	/** Clave asociada */

	private List<Products> products;

	/**
	 * Constructor
	 * 
	 * @param orderId
	 * @param purchaser
	 * @param shipAddress
	 */
	public Order(Long orderId, String purchaser, String shipAddress) {
		super();
		this.orderId = orderId;
		this.purchaser = purchaser;
		this.shipAddress = shipAddress;
		this.products = new ArrayList<>();
	}

	/**
	 * @return the orderId
	 */
	public Long getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the purchaser
	 */
	public String getPurchaser() {
		return purchaser;
	}

	/**
	 * @param purchaser the purchaser to set
	 */
	public void setReceiver(String purchaser) {
		this.purchaser = purchaser;
	}

	/**
	 * @return the shipAddress
	 */
	public String getShipAddress() {
		return shipAddress;
	}

	/**
	 * @param shipAddress the shipAddress to set
	 */
	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	/**
	 * @return the OnPeninsula
	 */
	public boolean onPeninsula() {
		return onPeninsula;
	}

	/**
	 * @param onPeninsula the onPeninsula to set
	 */
	public void setOnPeninsula(boolean onPeninsula) {
		this.onPeninsula = onPeninsula;
	}

	/**
	 * @return the products
	 */
	public List<Products> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(List<Products> products) {
		this.products = products;
	}

	/**
	 * Añadir productos a la lista
	 * 
	 * @param product
	 */
	public void addProduct(Products product) {
		if (!this.products.contains(product)) {
			this.products.add(product);
		}

	}

	/**
	 * Obtener el valor total del pedido
	 * 
	 * @return totalPrice
	 */
	public Float getTotalPrice() {
		Float totalPrice = 0.0f;
		for (Products p : this.getProducts()) {
			totalPrice += p.getPriceWithTaxes();
		}
		return totalPrice;
	}

	/**
	 * Eliminar los productos
	 */
	public void deleteProducts() {
		this.products.clear();
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", purchaser=" + purchaser + ", shipAddress=" + shipAddress
				+ ", onPeninsula=" + onPeninsula + ", products=" + products + "]";
	}

}
