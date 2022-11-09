package com.example.demo.model;

import java.util.Objects;

public class Block {

	private int blockId;
	private String code;
	
	public Block(int blockId, String code)
	{
		this.blockId = blockId;
		this.code = code;
	}
	
	public int getBlockId() {
		return blockId;
	}
	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
	public int hashCode()
	{
		return Objects.hashCode(blockId+code);
	}
	
	public boolean equals(Object o)
	{
		if(this == o)
			return true;
		
		if(o == null || o.getClass()!=this.getClass())
			return false;
		
		Block tempBlock = (Block) o;
		return (this.blockId == tempBlock.blockId && this.code == tempBlock.code);
		
	}
}
