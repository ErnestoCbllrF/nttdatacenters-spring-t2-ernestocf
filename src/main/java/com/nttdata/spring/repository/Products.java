package com.nttdata.spring.repository;

/**
 * Taller 2 Spring
 * 
 * Clase Productos
 * 
 * @author ernestocf
 *
 */
public class Products {
	/** ID producto */
	private Long productId;

	/** Nombre del producto */
	private String productName;

	/** Precio con IVA */
	private float priceWithTaxes;

	/** Precio sin IVA */
	private float priceWOTaxes;

	/**
	 * @return the productId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the priceWithTaxes
	 */
	public float getPriceWithTaxes() {
		return priceWithTaxes;
	}

	/**
	 * @param priceWithTaxes the priceWithTaxes to set
	 */
	public void setPriceWithTaxes(float priceWithTaxes) {
		this.priceWithTaxes = priceWithTaxes;
	}

	/**
	 * @return the priceWOTaxes
	 */
	public float getPriceWOTaxes() {
		return priceWOTaxes;
	}

	/**
	 * @param priceWOTaxes the priceWOTaxes to set
	 */
	public void setPriceWOTaxes(float priceWOTaxes) {
		this.priceWOTaxes = priceWOTaxes;
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", priceWithTaxes="
				+ priceWithTaxes + ", priceWOTaxes=" + priceWOTaxes + "]";
	}

}
