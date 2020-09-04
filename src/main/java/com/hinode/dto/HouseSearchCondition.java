package com.hinode.dto;

import lombok.Data;

@Data
public class HouseSearchCondition {
	
	private String station;
	
	private String name;

	private String address;

	private String roomType;

	private int rentFeeFrom;

	private int rentFeeTo;

	private int depositeFeeFrom;

	private int depositeFeeTo;

	private int guaranteeFeeFrom;

	private int guaranteeFeeTo;

	private double areaFrom;

	private double areaTo;
	
	private int page;
}
