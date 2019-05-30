package cloud01.service;

import cloud01.pojo.Order;

public interface OrderService {
	//获取指定订单号的订单信息
	Order getOrder(String orderId);
	
	//添加订单
	void addOrder(Order order);
}
