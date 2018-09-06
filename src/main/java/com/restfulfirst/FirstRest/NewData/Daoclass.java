package com.restfulfirst.FirstRest.NewData;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class Daoclass {

	private static List<AccessClass> userss = new ArrayList<>();
	private static int usersCount = 3;

	static {

		userss.add(new AccessClass("Akash", "Pate", 1));
		userss.add(new AccessClass("Second", "Data", 2));
		userss.add(new AccessClass("Third", "Data", 3));
	}

	public List<AccessClass> findAlluser() {

		return userss;
	}

/*	public AccessClass save(AccessClass user) {

		
		if (user.getId() == null) {
			user.setId(++usersCount);
		}
		userss.add(user);
		return user;

	}*/

}
