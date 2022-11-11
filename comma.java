//comma separated
import java.util.Scanner;
class comma
{
	public static void main(String arg[])
	{
		int i;
		String name;
		Scanner s=new Scanner(System.in);
		name=s.next();
		for(i=0;i<name.length();i++)
		{
			if(name.charAt(i)>96 && name.charAt(i)<123)
				System.out.print(',');
			else
				System.out.print(name.charAt(i));
		}
	}
}