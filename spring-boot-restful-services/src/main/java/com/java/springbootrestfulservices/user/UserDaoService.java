package com.java.springbootrestfulservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<User>();
	private static int usersCount = 3;

	static {
		users.add(new User(1, "Abi", new Date()));
		users.add(new User(2, "Gobi", new Date()));
		users.add(new User(3, "Ram", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User saveUser(User user) {
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}

	public User findUser(int id) {
		for (User user : users) {
			if (user.getId() == id)
				return user;
		}
		return null;
	}

	public User deleteUser(int id) {
		Iterator<User> userIterator = users.iterator();
		while (userIterator.hasNext()) {
			User user = userIterator.next();
			if (user.getId() == id) {
				userIterator.remove();
				return user;
			}
		}
		return null;
	}
}
