package com.biz.exec.service;

public class PayVO {
	
	private int pay;
	private int money;
	private int paper;
	
	
	
	
	public PayVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PayVO(int pay, int money, int paper) {
		super();
		this.pay = pay;
		this.money = money;
		this.paper = paper;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPaper() {
		return paper;
	}
	public void setPaper(int paper) {
		this.paper = paper;
	}
	@Override
	public String toString() {
		return "PayVO [pay=" + pay + ", money=" + money + ", paper=" + paper + "]";
	}
	
	

}
