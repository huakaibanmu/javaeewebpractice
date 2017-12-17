package com.jikexueyuan_javaweb.entity;
/**
 * 用户信息实体类
 * @author Dell
 *
 */
public class Sys {
/**
 * 自增id
 */
private int id; 
/**
 * 用户级别
 */
private int user_level;
/**
 * 最少人数
 */
private int user_min;
/**
 * 最多人数
 */
private int user_max;
/**
 * 奖金
 */
private double money;
/**
 * 创建时间
 */
private long created_time;
/**
 * 创建人
 */
private String creator;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUser_level() {
	return user_level;
}
public void setUser_level(int user_level) {
	this.user_level = user_level;
}
public int getUser_min() {
	return user_min;
}
public void setUser_min(int user_min) {
	this.user_min = user_min;
}
public int getUser_max() {
	return user_max;
}
public void setUser_max(int user_max) {
	this.user_max = user_max;
}
public double getMoney() {
	return money;
}
public void setMoney(double money) {
	this.money = money;
}
public long getCreated_time() {
	return created_time;
}
public void setCreated_time(long created_time) {
	this.created_time = created_time;
}
public String getCreator() {
	return creator;
}
public void setCreator(String creator) {
	this.creator = creator;
}


}
