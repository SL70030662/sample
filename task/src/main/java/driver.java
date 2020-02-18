import java.util.Scanner;
public class driver
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		float p,r;
		int t;
		p=sc.nextFloat();
		r=sc.nextFloat();
		t=sc.nextInt();
		simple s=new simple();
		compound c=new compound();
		s.si(p, t, r);
		c.ci(p,t,r);
		
		sc.close();
		
		
		
	}
}
