import java.util.Scanner;
class average
{
	public static void main(String arg[])
	{
		int i,n,temp;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		Float avg,unit,ten,hud;
		unit=(float)n%10;
		ten=((float)n/10)%10;
		hud=((float)n/100)%10;
		avg=(unit+ten+hud)/3;
	System.out.println(avg);
	}	
}