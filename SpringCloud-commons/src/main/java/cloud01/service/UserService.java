package cloud01.service;

import cloud01.pojo.User;

public interface UserService {
	//��ȡָ��id���û���Ϣ
	User getUser(Integer id);
	//���û���ӻ���
	void addScore(Integer id, Integer score);
}
