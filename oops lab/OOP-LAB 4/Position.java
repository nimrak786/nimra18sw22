import java.util.*;
class Position{
	public static void main(String args[])
	{
		int[] array_={1,2,3,4,6,5};
		Scanner sc=new Scanner(System.in);
		int input_=sc.nextInt();
		for(int i=0;i<=array_.length;i++){
			if(input_==array_[i]){
				System.out.println("The position of Number is:"+i);
				break;

			}
			
		}
	}
}