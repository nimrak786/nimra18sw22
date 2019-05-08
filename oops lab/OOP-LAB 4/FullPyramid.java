import java.util.*;
class FullPyramid{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++){
			for(int j=5;j>=i;j--){
				System.out.print(" ");
			}
			for(int z=1;z<=i;z++){
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}