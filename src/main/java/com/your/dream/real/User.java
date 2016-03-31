
public class User {
	String userName;
	String address;
	int lineNum;
	int min;
	Grade grade;
	
	User(){
		userName = null;
		address = null;
		min = 0;
		lineNum = 0;
	}
	
	String getter_userName(String user){
		this.userName = user;
	}
	void setter_userName(){
		return userName;
	}
	String getter_address(String address){
		this.address = address;
	}
	void setter_userName(){
		return this.address;
	}
	int getter_lineNum(int line){
		this.lineNum = line;
	}
	void setter_lineNUm(){
		return lineNum
	}
	int getter_min()){
		return min;
	}
	void setter_min(int usingTime){
		this.min = usingTime;
	}
	
	Grade getter_grade(){
		return grade;
	}
	void setter_grade(char grade){
		if(grade == g || grade == G)
			grade = new Gold();
		grade = new Silver();
	}
}
