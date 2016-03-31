package com.your.dream.real;

public class Appcontroller {
	public User user = new User();
	   public calculateBill cal;
	   
	   public void run(){
		  this.user.setGrade('s');
		  this.user.setMin(521);
		  this.user.setLineNum(5);
		  
	      this.cal = new calculateBill(user);
	      
	      double bil = cal.calBasicBill() + cal.calAddBill() + cal.calFamilyDiscount();
	      System.out.printf("금액 : %.2f\n",bil);
	   }
	   
}
