//expand the number
import java.util.Scanner;
class expand
{
	public static void  main(String arg[])
	{
	int n,i,x,temp;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	temp=n;
	while(temp!=0)
	{
		x=temp%10;
		for(i=0;i<x;i++)
		System.out.print(x);
		temp=temp/10;
	}
	}
}