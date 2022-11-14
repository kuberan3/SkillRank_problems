import java.lang.*;
import java.util.Scanner;
class Tarzan
{
	public static void main(String args[])
	{
		int a,b,c,d,x,amtinhand;
		System.out.print("Enter a,b,c,d:");
		System.out.print("Enter x:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		x=s.nextInt();
		amtinhand=(a*1)+(b*2)+(c*5)+(d*10);
		if(amtinhand==x)
		{
			System.out.println("PAID");
		}
		else if(amtinhand>x)
		{
			System.out.println("PAID "+(int)(amtinhand-x));
		}
		else
		{
			System.out.println("NOT PAID "+amtinhand);
		}
	}
}