

import java.util.*;

interface Arithmetic

{

    public int SumFactors(int n);

}

class SumFactors implements Arithmetic

{

    public int SumFactors(int n)

    {

        int i=1;

        int sum=0;

        while(i<=n)

        {

            if(n%i==0)

            sum=sum+i;

            i++;

        }

        return sum;

    }



    public static void main(String args[])

    {

        SumFactors f=new SumFactors();

        Scanner sc=new Scanner(System.in);

        System.out.println("Please Enter a Number");

        int n=sc.nextInt();

        System.out.println("Sum of Factors of  "+n+"  are: "+f.SumFactors(n));

    }

}