import java.util.*;
class Task04{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first operhand:");
	float y=sc.nextFloat();
	System.out.println("Enter the second operhand:");
	float x=sc.nextFloat();
	// char ch=sc.next().charAt(0);
	System.out.println("Enter the Arithmetic operation:");
	char ch=sc.next().charAt(0);
	switch(ch){
	case '+':{
	System.out.println("The addition of two operhand is:"
	+(x+y));
	break;
	}
	case '-':{
	System.out.println("The subtraction of two operhand is:"
	+(x-y));
	break;
	}
	case '*':{
	System.out.println("The multiplication of two operhand is:"
	+(x*y));
     break;
	}
	case '/':
	{
		System.out.println("The division of two operhand is:"
	+(x/y));
		break;
	}
    default:
	}
}
}