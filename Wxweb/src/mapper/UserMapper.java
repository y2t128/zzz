package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.User;

public interface UserMapper {
	/**
	 * 查询user用户表支持条件查询
	 * @param user 入参函数
	 * @return
	 */
	public List<User> userQueryList(User user);
	/**
	 * 删除某个user用户
	 * @param id
	 * @return
	 */
	public int userDelete(@Param("id") int id);
	/**
	 * 查询某个用户
	 * @param id
	 * @return
	 */
	public List<User> userIdList(@Param("id") int id);
}
