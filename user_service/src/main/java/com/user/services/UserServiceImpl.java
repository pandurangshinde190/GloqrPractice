package com.user.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService{

	List<User> list=new ArrayList<User>();		
	
	public UserServiceImpl()
	{
		list.add(new User(123L,"Pandurang","7083021253"));
		list.add(new User(456L,"Om","1234567982"));
		list.add(new User(789L,"Jay","4567891235"));
		
}
	
	
	
	
	@Override
	public User getUser(Long id) {
	
		return (User) list.stream().filter(User->User.getUserId().equals(id)).findAny().orElse(null);
	}
}