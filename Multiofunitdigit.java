//multiples of unit digit
import java.lang.*;
import java.util.Scanner;
class Multiofunitdigit
{
	public static void main(String args[])
	{
		int n,i,val,unitdigit;
		System.out.println("Enter n:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		unitdigit=n%10;
		if(unitdigit==0)
			val=10;
		else
			val=unitdigit;
		for(i=1;val*i<=n;i++)
		{
			System.out.println(val*i);
		}
	}
}