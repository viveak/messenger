package org.vivani.communicator.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
private long id;
private String profileName;
private String firstName;
private String lastName;
private Date dtCreated;

public Profile() {
	super();
	// TODO Auto-generated constructor stub
}

public Profile(long id, String profileName, String firstName, String lastName) {
	super();
	this.id = id;
	this.profileName = profileName;
	this.firstName = firstName;
	this.lastName = lastName;
}

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getProfileName() {
	return profileName;
}
public void setProfileName(String profileName) {
	this.profileName = profileName;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

}
