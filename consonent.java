//count of consonent in range
import java.util.Scanner;
class consonent
{
	public static void main(String arg[])
	{
		int i,count=0;
		char st,end;
		Scanner s=new Scanner(System.in);
		st=s.next().charAt(0);
		end=s.next().charAt(0);
		for(i=st;i<=end;i++)
		{
			if(i!='a' && i!='e' && i!='i' && i!='o' && i!='u')
				count++;
		}System.out.println(count);
	}
}