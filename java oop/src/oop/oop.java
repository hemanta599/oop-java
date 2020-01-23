package oop;


public class oop {

	static private first obfirst;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		obfirst = new first("mm", "like", "pen", "ddd", "ka", "putul");
		String nameT= obfirst.presentAmountOfFuel();
		prln(nameT);

	}
	

	static void prln(Object myobject) {
		System.out.println(myobject);
	}
	static void pr(Object myobject) {
		System.out.print(myobject);
	}

}
