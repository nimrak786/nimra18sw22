import java.util.*;
class Task02{
	public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your bill:");
    float unit=sc.nextFloat();
    float count=0;
    count=count+50*10;
    if(count<=50){
    	count=0;
    	System.out.println("The price is"+(unit*10));}
    else if (unit>=50 && unit<=100){
    	count=count+(unit-50)*15;
    	System.out.println("The price is:"+count);
    }	
    else if(unit>=101 && unit <=200){
    	count=count+(50*15)+(unit-100)*20;
    	System.out.println("The price is:"+count);
    }
  else if(unit >=200 && unit<=300){
  	count=count+(50*15)+(100*20)+(unit-200)*25;
  	System.out.println("The price is:"+count);
  }
  else if(unit>=300){
count=count+(50*15)+(100*20)+(200*25)+(unit-300)*30;
System.out.println("The price is"+count);
  }

    

	}
}