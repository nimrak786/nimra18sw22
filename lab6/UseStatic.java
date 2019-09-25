class UseStatic{


	static int count=0;


	UseStatic(){


		count++;


	}


	public int getCount(){


		return count;


	}


}


class Task6{


	public static void main(String args[]){


		UseStatic s1=new UseStatic();


		System.out.println(s1.getCount());


		UseStatic s2=new UseStatic();


		UseStatic s3=new UseStatic();


		UseStatic s4=new UseStatic();


		System.out.println(s4.getCount());


	}


} 