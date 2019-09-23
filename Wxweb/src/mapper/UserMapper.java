package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.User;

public interface UserMapper {
	/**
	 * ��ѯuser�û���֧��������ѯ
	 * @param user ��κ���
	 * @return
	 */
	public List<User> userQueryList(User user);
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
