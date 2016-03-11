package com.ethohampton.database.objects.nature;

import java.util.UUID;

public class Branch {
	UUID parentTree = null;
	TreeType parentTreeType = null;

	/**
	 * 
	 * @param Parent tree
	 */
	public Branch(UUID parent) {
		parentTree = parent;
	}

	/**
	 * 
	 * @param Parent
	 * @param Type of tree
	 */
	public Branch(UUID parent, TreeType treeType) {
		parentTreeType = treeType;
	}

}
