package com.your.dream.real;

public class Silver extends Grade{
	
	Silver(){
		lineAddBill = 21.5;
		minAddBill = 0.54;
		limitMin = 500;
	}
	
	double getter_basicBill(){
		return basicBill;
	}
	double getter_lineBill(){
		return lineAddBill;
	}
	double getter_minBill(){
		return minAddBill;
	}
	int getter_limitMin(){
		return limitMin;
	}
	
	void setter_basicBill(){
		this.basicBill = 29.95;
	}
}
