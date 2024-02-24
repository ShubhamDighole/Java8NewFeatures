package doublecolon;

public class Test {
	
	public static void main(String[] args) {
		
//		Trial trial=()->System.out.print("Hello");
		
	//	trial.add();
		
		Main main = new Main();
		
//		Trial trialMain= main::doThis;
//		
//		trialMain.add();
	
	//static methods
		
		Trial trialStatic= Main::doThisStatic;
		
		trialStatic.add2();
		
	}
	

}
