package com.example.cloud.entity;

import java.math.BigDecimal;


/**
 * 
 * <dl>
 * <dd>描述: ~节点业务逻辑实现</dd>
 * <dd>创建时间：  2018年3月14日 下午12:39:19</dd>
 * <dd>创建人： pactera</dd>
 * <dt>版本历史: </dt>
 * 
 * <pre>
 * Date         Author      Version     Description
 * ------------------------------------------------------------------
 * 2018年3月14日      pactera       1.0        1.0 Version
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

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", name=" + name + ", age=" + age + ", balance=" + balance
				+ "]";
	}

	

}
