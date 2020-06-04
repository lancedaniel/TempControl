public class TempControl{
	static boolean increasing = true;
	
	public static int decrease (int temp) {
		while (temp > 60) {
			System.out.print (temp+ " ");
			temp -= 2;
		}
		increasing = true;
		return temp;
	}
	public static int increase (int temp) {
		while (temp < 80) {
			System.out.print (temp + " ");
			temp += 2;
		}
		increasing = false;
		return temp;
	}
	public static void main (String args[]) {
		int temp = 80;
		while (true) {
			if (increasing) {
				temp = increase(temp); //method call
				
			}
			else {
				temp = decrease(temp); //a method call
			}
		} //while
	} //main() method 
} //class