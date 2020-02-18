
public class compound {
	void ci(float p,int t,float r)
	{
		float c=(float) Math.pow(1+(r/100),t);
		c=c*p;
		c=c-p;
		System.out.println("compound interest is "+c);	
	}
	

}
