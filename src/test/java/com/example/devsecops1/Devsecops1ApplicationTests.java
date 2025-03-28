package com.example.devsecops1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Devsecops1ApplicationTests {

	@Test
	void contextLoads() {
		Car car = new Car("Ferrari", 2000);
		String brand = car.getBrand();
		assertEquals(brand, "Ferrari");
	}

}
