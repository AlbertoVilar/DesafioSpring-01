package com.vilar.desafioDev.services;


import com.vilar.desafioDev.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderServices {

	private ShippingService shippingService;

	public OrderServices(ShippingService shippingService) {

		this.shippingService = shippingService;
	}

	public ShippingService getShippingService() {
		return shippingService;
	}

	public void setShippingService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public Double total(Order order) {
		Double discount = order.getDiscount() / 100 * order.getBasic();
		 
		  return order.getBasic() + shippingService.shipment(order) - discount;
		 
	}


}
