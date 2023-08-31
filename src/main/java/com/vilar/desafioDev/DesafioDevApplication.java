package com.vilar.desafioDev;

import com.vilar.desafioDev.entities.Order;
import com.vilar.desafioDev.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication

public class DesafioDevApplication implements CommandLineRunner {
	@Autowired
	private OrderServices orderServices;

	public static void main(String[] args) {

		SpringApplication.run(DesafioDevApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter code: ");
		Integer code = sc.nextInt();
		System.out.print("Enter basic: ");
		Double basic = sc.nextDouble();
		System.out.print("Enter discount: ");
		Double discount = sc.nextDouble();
		Order order = new Order(code, basic, discount);
		Double total = orderServices.total(order);
		System.out.println();
		System.out.println("Order code: " +order.getCode());
		System.out.printf("Total value = $ %.2f ",  total);
	}
}
