package com.restfulfirst.FirstRest.Newuser;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class userDaoService {

	private static List<User> users = new ArrayList<>();
	private static int usersCount = 3;

	static {

		users.add(new User(1, "Hello", new Date()));
		users.add(new User(2, "Akash", new Date()));
		users.add(new User(3, "Patel", new Date()));
	}

	// Now we are creating some the methods

	// public List<User> findAll(){
	// public User save(User user){
	// public User findOne(int id){

	public List<User> findAll() {

		return users;
	}

	public User save(User user) {

		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}

	public User findOne(int id) {

		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public User deleteById(int id) {

		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext()) {
			User user = iterator.next();
			if (user.getId() == id) {
				iterator.remove();
				return user;
			}
		}
		return null;
	}

}
