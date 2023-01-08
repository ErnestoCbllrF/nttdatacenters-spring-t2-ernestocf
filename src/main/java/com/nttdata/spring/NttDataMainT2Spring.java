package com.nttdata.spring;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.nttdata.spring.repository.Order;
import com.nttdata.spring.repository.Products;
import com.nttdata.spring.services.OrderManagementServiceI;
import com.nttdata.spring.services.ProductManagementServiceI;

/**
 * Taller 2 Spring
 * 
 * Clase Principal
 * 
 * @author ernestocf
 *
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class NttDataMainT2Spring implements CommandLineRunner {

	@Autowired
	private ProductManagementServiceI productService;
	
	@Autowired
	@Qualifier("peninsularOrderService")
	private OrderManagementServiceI peninsularOrderService;

	@Autowired
	@Qualifier("notPeninsularOrderService")
	private OrderManagementServiceI notPeninsularOrderService;
	
	public static void main(String[] args) {
		SpringApplication.run(NttDataMainT2Spring.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Creación de productos

		Products pr1 = productService.addProduct(1L, "Fuente de alimentacion", 120.0f);
		Products pr2 = productService.addProduct(2L, "Cascos/Auriculares", 80.0f);
		Products pr3 = productService.addProduct(3L, "PC Sobremesa", 850.0f);
		Products pr4 = productService.addProduct(4L, "Ratón", 10.0f);
		Products pr5 = productService.addProduct(5L, "SSD 1TB", 75.0f);
		Products pr6 = productService.addProduct(6L, "Portátil", 500.0f);
		Products pr7 = productService.addProduct(5L, "Teclado", 25.0f);
		Products pr8 = productService.addProduct(6L, "Tarjeta Gráfica", 450.0f);

		// Creación de pedidos
		Order or1 = notPeninsularOrderService.createOrder(1L, "Pedro Quevedo", "C/Triana");
		Order or2 = notPeninsularOrderService.createOrder(2L, "Pedri González", "C/Castillo");
		Order or3 = peninsularOrderService.createOrder(3L, "Borja Iglesias", "C/Sierpes");
		Order or4 = peninsularOrderService.createOrder(4L, "Marcos Baena", "C/Gomera");

		// Pedidos de cada orden
		notPeninsularOrderService.addProductsToOrder(pr1, or1);
		notPeninsularOrderService.addProductsToOrder(pr4, or1);
		notPeninsularOrderService.addProductsToOrder(pr3, or2);
		notPeninsularOrderService.addProductsToOrder(pr2, or2);
		peninsularOrderService.addProductsToOrder(pr5, or3);
		peninsularOrderService.addProductsToOrder(pr8, or3);
		peninsularOrderService.addProductsToOrder(pr6, or4);
		peninsularOrderService.addProductsToOrder(pr7, or4);

		// Eliminar un pedido
		notPeninsularOrderService.cancelOrder(or2);

		// Enseñar los pedidos
		notPeninsularOrderService.showOrder(or1);
		notPeninsularOrderService.showOrder(or2);
		peninsularOrderService.showOrder(or3);
		peninsularOrderService.showOrder(or4);

	}

}
