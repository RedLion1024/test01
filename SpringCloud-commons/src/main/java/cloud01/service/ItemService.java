package cloud01.service;

import java.util.List;

import cloud01.pojo.Item;

public interface ItemService {
	//��ȡ������Ʒ��Ϣ
	List<Item> getItems(String orderId);
	//������Ʒ���
	void decreaseNumbers(List<Item> list);
}