import java.util.Scanner;
class group
{
    public static void main(String arg[])
    {
        int n,i;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        long a[]=new long[n],sum=0;
        for(i=0;i<n;i++)
        a[i]=s.nextLong();
	for(i=0;i<n;i++)
	sum=sum+a[i];
	System.out.println(sum);
    }
}