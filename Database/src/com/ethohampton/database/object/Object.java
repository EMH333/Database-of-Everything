package com.ethohampton.database.object;

import java.util.UUID;

public class Object {

	private UUID uuid;
	
	public Object() {
		setUuid(UUID.randomUUID());
	}

	/**
	 * @return the uuid
	 */
	public UUID getUuid() {
		return uuid;
	}

	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

}
