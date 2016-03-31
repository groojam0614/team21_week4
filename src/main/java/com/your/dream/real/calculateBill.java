package com.your.dream.real;

public class calculateBill {

	public User user = new User();
	private int familyDiscount = 5;
	
	int lineNum = user.getter_lineNum();
	
	public double calBasicBill(){
		
		
		if(3 <  lineNum )
			return user.getter_grade.getter_basicBill() + 2*user.getter_grade.lineAddBill ;
		else if (0 < lineNum )
			return user.getter_grade.getter_basicBill() + (lineNum-1)*user.getter_grade.lineAddBill;
		else
			{System.out.println("error lineNum :" + lineNum);
			return 0;
			}
	}
	
	public double calAddBill(){
		int limitMin = user.getter_grade.getter_limitMin();
		int min = user.getter_min();
		if(  limitMin < min )
			return (min-limintMin)* user.getter_grade.getter_minBill();
		else if ( min > 0)
			return 0 ;
	}
	public int calFamilyDiscount(){
		
		if( lineNum > 3 )		
		return familyDiscount * (lineNum-3) ;
	}
	
	
}
