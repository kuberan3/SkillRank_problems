import java.lang.*;
import java.util.Scanner;
class Password
{
	public static void main(String args[])
	{
		String s;
		int flag=0,flag1=0,flag2=0,flag3=0,i;
		Scanner p=new Scanner(System.in);
		s = p.next();
		if(s.length()>=8 && s.length()<15)
		{
			for(i=0;i<s.length();i++)
			{
				if((int)(s.charAt(i))>=97 && (int)(s.charAt(i))<=122)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("Password must contain atleast one lowercase letter");
			for(i=0;i<s.length();i++)
			{
				if((int)(s.charAt(i))>=65 && (int)(s.charAt(i))<90)
				{
					flag1=1;
					break;
				}
			}
			if(flag1==0)
				System.out.println("Password must contain atleast one uppercase letter");
			for(i=0;i<s.length();i++)
			{
				if((int)(s.charAt(i))>=48 && (int)(s.charAt(i))<=57)
				{
					flag2=1;
				}
			}
			if(flag2==0)
				System.out.println("Password must contain atleast one number");
			for(i=0;i<s.length();i++)
			{
				if((int)(s.charAt(i))>=32 && (int)(s.charAt(i))<=47 || (int)(s.charAt(i))>=58 && (int)(s.charAt(i))<=64 || (int)(s.charAt(i))>=91 && (int)(s.charAt(i))<=96)
				{
					flag3=1;
					break;
				}
			}
			if(flag3==0)
				System.out.println("Password must contain atleast one special symbol");
			if(flag>0 && flag1>0 && flag2>0 && flag3>0)
				System.out.println("Strong password");
			else	
				System.out.println("Weak Password");
		}
		else
			System.out.println("Password length should be 8 to 15 characters");
	}
}