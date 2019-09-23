package serviceImpl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import mapper.UserMapper;

import pojo.User;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper userMap;

	@Override
	public PageInfo<User> userQueryList(int index, int pagesize, User user) {
		// TODO Auto-generated method stub
		PageHelper.startPage(index, pagesize);
		List<User> list = userMap.userQueryList(user);
		return new PageInfo<User>(list) ;
	}

	@Override
	public int userDelete(int id) {
		// TODO Auto-generated method stub
		return userMap.userDelete(id);
	}

	@Override
	public List<User> userIdList(int id) {
		// TODO Auto-generated method stub
		return userMap.userIdList(id);
	}
	
}
