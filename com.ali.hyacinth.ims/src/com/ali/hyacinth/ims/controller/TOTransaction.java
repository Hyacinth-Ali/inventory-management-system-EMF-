package com.ali.hyacinth.ims.controller;

import java.util.Date;

public class TOTransaction {
	
	private Date date;
	private float totalAmount;
	private float amountPaid;
	/**
	 * @param date
	 * @param totalAmount
	 * @param amountPaid
	 */
	public TOTransaction(Date date, float totalAmount, float amountPaid) {
		super();
		this.date = date;
		this.totalAmount = totalAmount;
		this.amountPaid = amountPaid;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the totalAmount
	 */
	public float getTotalAmount() {
		return totalAmount;
	}
	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * @return the amountPaid
	 */
	public float getAmountPaid() {
		return amountPaid;
	}
	/**
	 * @param amountPaid the amountPaid to set
	 */
	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}
	
}
