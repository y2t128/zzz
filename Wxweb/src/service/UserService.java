package service;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.PageInfo;


import pojo.User;

public interface UserService {
	/**
	 * 查询user用户表支持条件查询
	 * @param user 入参函数
	 * @return
	 */
	public PageInfo<User> userQueryList(int index,int pagesize,User user);
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
