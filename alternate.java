//alternare 0 and 1
import java.util.Scanner;
class alternate
{
public static void main(String arg[])
{
	int i,a;
	Scanner s=new Scanner(System.in);
	a=s.nextInt();
	int a[]=new int[20];
	for(temp=a,i=0;temp!=0;i++,temp=temp/2)
	{
		a[i]=temp%2;
	}
	for(j=i-1;j>=1;j--)
	{
		if(a[j]==a[j-1]);
		break;
	}
	if(j>=1)
	System.out.println("no");
	else
	System.out.println("yes");
} 
}