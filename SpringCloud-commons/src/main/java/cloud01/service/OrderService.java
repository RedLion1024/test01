package cloud01.service;

import cloud01.pojo.Order;

public interface OrderService {
	//��ȡָ�������ŵĶ�����Ϣ
	Order getOrder(String orderId);
	
	//��Ӷ���
	void addOrder(Order order);
}
