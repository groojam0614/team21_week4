package com.your.dream.real;

public class Gold extends Grade{

	Gold(){
		basicBill = 49.95;
		lineAddBill = 14.5;
		minAddBill = 0.45;
		limitMin = 1000;
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
