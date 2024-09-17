package com.example.Server;

import java.util.HashMap;
import java.util.Map;

import com.example.Connection.Connection;

public class ModelGuiServer {
	// модель хранит карту со всеми подключившимися клиентами ключ — имя клиента,
	// значение — объект connecton
	private Map<String, Connection> allUsersMultiChat = new HashMap<>();

	protected Map<String, Connection> getAllUsersMultiChat() {
		return allUsersMultiChat;
	}

	protected void addUser(String nameUser, Connection connection) {
		allUsersMultiChat.put(nameUser, connection);
	}

	protected void removeUser(String nameUser) {
		allUsersMultiChat.remove(nameUser);
	}
}