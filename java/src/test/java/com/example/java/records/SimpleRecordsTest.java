package com.example.java.records;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SimpleRecordsTest {

	@Test
	void records() {
		var customer = new Customer(253, "Tammie");
		var order1 = new Order(2232, 74.023);
		var order2 = new Order(9593, 23.44);
		var cos = new CustomerOrders(customer, List.of(order1, order2));
		Assertions.assertEquals(2232, order1.id());
		Assertions.assertEquals(74.023, order1.total());
		Assertions.assertEquals("Tammie", customer.name());
		Assertions.assertEquals(2, cos.orders().size());
		IO.println("order components  " + order1.id() + ':' + order1.total()); // <2>
	}

	// <1>
	record Customer(Integer id, String name) {
	}

	record Order(Integer id, double total) {
	}

	record CustomerOrders(Customer customer, List<Order> orders) {
	}

}
