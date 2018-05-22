package com.example.cloud.entity;

import java.math.BigDecimal;

/**
 * <dl>
 * <dd>描述: ~节点业务逻辑实现</dd>
 * <dd>创建时间： 2018/1/25 14:03</dd>
 * <dd>创建人： GuoDong</dd>
 * <dt>版本历史:</dt>
 * 
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018/1/25 14:03    GuoDong       1.0        1.0 Version
 * </pre>
 * </dl>
 */
public class User {
	
	private long id;
	
	private String username;
	
	private String name;
	
	private short age;
	
	private BigDecimal balance;

	public long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getName() {
		return name;
	}

	public short getAge() {
		return age;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
}
