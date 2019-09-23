package service;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.PageInfo;


import pojo.User;

public interface UserService {
	/**
	 * ��ѯuser�û���֧��������ѯ
	 * @param user ��κ���
	 * @return
	 */
	public PageInfo<User> userQueryList(int index,int pagesize,User user);
	/**
	 * ɾ��ĳ��user�û�
	 * @param id
	 * @return
	 */
	public int userDelete(@Param("id") int id);
	/**
	 * ��ѯĳ���û�
	 * @param id
	 * @return
	 */
	public List<User> userIdList(@Param("id") int id);
}
