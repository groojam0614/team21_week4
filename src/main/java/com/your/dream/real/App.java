package com.your.dream.real;

/**
 * Hello world!
 *
 */
public class App 
{
	public static User user = new User();
	public static calculateBill cal;
	
	private App() 
	{
		// do not create App class directly
	}
	
    public static void main( String[] args ) {
    	user.setGrade('s');
		user.setMin(521);
		user.setLineNum(5);
		
		cal = new calculateBill(user);
		
		printBill();
    }
  
	
	public static void printBill(){
		double bil = cal.calBasicBill() + cal.calAddBill() + cal.calFamilyDiscount();
		System.out.printf("금액 : %.2f\n",bil);
	}
    
    
}
