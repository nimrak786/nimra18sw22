import java.util.*;
class Table{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Table_No:");
		int input_=sc.nextInt();
		System.out.println("Starting_Point:");
		int input0_=sc.nextInt();
		System.out.println("Ending_Point:");
		int input1_=sc.nextInt();
		for(int i=input0_;i<=input1_;i++){
			System.out.println(input_+"x"+i+"="+(input_*i));
		}

	}
}