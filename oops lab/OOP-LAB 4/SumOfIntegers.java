import java.util.*;
class SumOfIntegers{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of Integers:");
		int number_=sc.nextInt();
		int sum=0;
		for(int i=1;i<=number_;i++){
			int input_=sc.nextInt();
			sum=sum+input_;
		}
		System.out.println("The sum of integers is:"+sum);
	}
}