package com.justin.spring.web.app.util;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Bean to represent a month's wage slip.
 * @author Justin Alderson
 *
 */
@Entity
@Table(name="wages")
public class WageSlip {
	
	//Should work fine without....   @Column(name="name") etc..
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="month")
	private String month;
	@Column(name="health")
	private int health;
	@Column(name="tax")
	private int tax;
	@Column(name="overtime")
	private int overtime;
	@Column(name="hoursworked")
	private int hoursWorked;
	@Column(name="overtimeworked")
	private int overtimeWorked;
	@Column(name="shift")
	private int shift;
	@Column(name="regularity")
	private int regularity;
	@Column(name="base")
	private int basePay;
	@Column(name="total")
	private int totalPay;
	@Column(name="actual")
	private int actualPay;
	
	public WageSlip() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public int getOvertimeWorked() {
		return overtimeWorked;
	}

	public void setOvertimeWorked(int overtimeWorked) {
		this.overtimeWorked = overtimeWorked;
	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}

	public int getRegularity() {
		return regularity;
	}

	public void setRegularity(int regularity) {
		this.regularity = regularity;
	}

	public int getBasePay() {
		return basePay;
	}

	public void setBasePay(int basePay) {
		this.basePay = basePay;
	}

	public int getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(int totalPay) {
		this.totalPay = totalPay;
	}

	public int getActualPay() {
		return actualPay;
	}

	public void setActualPay(int actualPay) {
		this.actualPay = actualPay;
	}
	
}