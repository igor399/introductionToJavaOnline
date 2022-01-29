package by.epam.task6.library.util;

import by.epam.task6.library.entity.User;
import by.epam.task6.library.entity.UserLevel;

public class UserBuilder {
	private User user;

	public UserBuilder(String login, String password) {
		user = new User(login, password);
	}

	public UserBuilder setName(String name) {
		user.setUsername(name);
		return this;
	}

	public UserBuilder setUserLevel(UserLevel userLevel) {
		user.setUserLevel(userLevel);
		return this;
	}

	public UserBuilder setEmail(Email email) {
		user.setEmail(email);
		return this;
	}

	public User build() {
		return user;
	}
}
