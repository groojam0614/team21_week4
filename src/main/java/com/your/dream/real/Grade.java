
public class Grade {
	double basicBill;
	double lineAddBill;
	double minAddBill;
	int limitMin;
	
	Grade(){
		basicBill = 0;
		lineAddBill = 0;
		minAddBill = 0;
		limitMin = 0;
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
}
