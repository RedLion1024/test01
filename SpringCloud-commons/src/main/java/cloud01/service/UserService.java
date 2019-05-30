package cloud01.service;

import cloud01.pojo.User;

public interface UserService {
	//获取指定id的用户信息
	User getUser(Integer id);
	//向用户添加积分
	void addScore(Integer id, Integer score);
}
