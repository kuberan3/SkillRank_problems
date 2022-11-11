//next occuring consonent
import java.util.Scanner;
class next
{
	public static void main(String arg[])
	{
		int i;
		char ch;
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		if(ch=='z')
			System.out.print("b");
		else if(ch=='Z')
			System.out.print("B");
		else if(ch+1!='a' && ch+1!='e' &&ch+1!='i' &&ch+1!='o' &&ch+1!='u')	
			System.out.print((char)(ch+1));
		else
			System.out.print((char)(ch+2));
	}
}