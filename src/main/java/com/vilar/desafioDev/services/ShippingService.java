package com.vilar.desafioDev.services;


import com.vilar.desafioDev.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

	public Double shipment(Order order) {

	Double amount = 0.0;
		if (order.getBasic() < 100) {
			amount += 20.0;
		} else if(order.getBasic() <= 200) {
			amount += 12.0;
		} else {
			amount += 0.0;
		}
		return amount;
	}
}
