package com.dayanand.userloginregistration.userDao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dayanand.userloginregistration.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
	
@Query("from User where uname=?1 and upwd=?2")
public User findByUnameUpwd(String uname, String upwd);

}
