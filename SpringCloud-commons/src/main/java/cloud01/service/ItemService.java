package cloud01.service;

import java.util.List;

import cloud01.pojo.Item;

public interface ItemService {
	//获取所有商品信息
	List<Item> getItems(String orderId);
	//减少商品库存
	void decreaseNumbers(List<Item> list);
}