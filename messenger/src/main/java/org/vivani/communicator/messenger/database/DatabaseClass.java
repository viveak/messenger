package org.vivani.communicator.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.vivani.communicator.messenger.model.Message;
import org.vivani.communicator.messenger.model.Profile;

public class DatabaseClass {

	private static Map<Long,Message> messages=new HashMap<>();
	private static Map<Long,Profile> profiles=new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}

}
