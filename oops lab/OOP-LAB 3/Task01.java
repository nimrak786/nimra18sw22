import java.util. *;
class Task01{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your marks in operating system:");
		
		float operatingsystem=sc.nextFloat();
		System.out.println("Enter your marks in data structures:");
		
		float datastructures=sc.nextFloat();
		System.out.println("Enter your marks in c++:");
		
		float cpp =sc.nextFloat();
		Float obtainedmarks=operatingsystem+datastructures+cpp;
		
		System.out.println("The Percentage is:"+(obtainedmarks*100)/300);
		
		if((obtainedmarks*100)/300>90){
		System.out.println("A-1 Grade");	
		}
		else if((obtainedmarks*100)/300<=90 && (obtainedmarks*100)/300>=80){
			System.out.println("B-Grade");

		}
		else if((obtainedmarks*100)/300 <=80 && (obtainedmarks*100)/300>=70 ){
			System.out.println("C-Grade");
		}
		else if((obtainedmarks*100)/300<=70 && (obtainedmarks*100)/300>=60){
			System.out.println("D-Grade");
		}
		else if((obtainedmarks*100)/300<60){
			System.out.println("Fail");
		}


	}
}