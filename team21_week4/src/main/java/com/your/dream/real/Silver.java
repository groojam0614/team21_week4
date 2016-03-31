package com.your.dream.real;

public class Silver extends Grade{
	
	Silver(){
		basicBill = 29.95;
		lineAddBill = 21.5;
		minAddBill = 0.54;
		limitMin = 500;
	}
	
	float getter_basicBill(){
		return basicBill;
	}
	float getter_lineBill(){
		return lineAddBill;
	}
	float getter_minBill(){
		return minAddBill;
	}
	int getter_limitMin(){
		return limitMin;
	}
}
