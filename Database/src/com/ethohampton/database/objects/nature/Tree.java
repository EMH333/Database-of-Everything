package com.ethohampton.database.objects.nature;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.ethohampton.database.objects.Object;

public class Tree extends Object {
	private TreeType type = TreeType.DEFAULT;
	List<java.util.UUID> Branches = new ArrayList<UUID>();

	public Tree() {
	}
/**
 * 
 * @param typeOfTree
 */
	public Tree(TreeType typeOfTree) {
		this.type = typeOfTree;

	}
	/**
	 * 
	 * creates a branch
	 * @return The newly create branch
	 */
	public Branch createBranch(){
		Branch newBranch = new Branch(UUID,type);
		return newBranch;
	}

	/**
	 * 
	 * @return Type of tree
	 */
	public TreeType getType() {
		return type;
	}

	/**
	 * 
	 * @param New type of tree
	 */
	public void setType(TreeType type) {
		this.type = type;
	}

}
