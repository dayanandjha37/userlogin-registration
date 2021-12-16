package com.dayanand.userloginregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayanand.userloginregistration.entity.User;
import com.dayanand.userloginregistration.userDao.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo repo;

	public User getValidation(User user) {

		if (!((user.getRname() == "") || (user.getUname() == "") || (user.getUemail() == "") || (user.getUpwd() == "")
				|| (user.getUmobile() == ""))) {

			return repo.save(user);
		} else {
			return null;
		}
	}

	public User findByUnameUpwd(String uname, String upwd) {

		return repo.findByUnameUpwd(uname, upwd);
	}
}
