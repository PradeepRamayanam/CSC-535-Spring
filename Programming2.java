
public class Programming2 
{
	public static void main(String[] args)
	 {
		 int c=0;
		 int d=0;
		 int e=0;
		 int f=0;
		 
		 for (int i=2;i <1000000; i=i+1)
		 {
			 
			 if (i%9==0)
			 {
				 c=c+1;
			 }
			 if (i%13==0)
			 {
				 d=d+1;
			 }
			 if (i%27==0)
			 {
				e=e+1;
			 }
			 if (i%81==0)
			 {
				 f=f+1;
			 }
			 
	}
		 int sum = c+d+e+f;
		 int total = c+d;
		 System.out.println("The total count of numbers divided by 9 between 1 and million is " + c);
		 System.out.println("The total count of numbers divided by 13 between 1 and million is " + d);
		 System.out.println("The total count of numbers divided by 27 between 1 and million is " + e);
		 System.out.println("The total count of numbers divided by 81 between 1 and million is " + f);
		 System.out.println("The total sum of numbers divided by 9, 13, 27 & 81 between 1 and million is " + sum);
		 System.out.println("The total count of numbers divided by all 9, 13, 27 & 81 between 1 and million is " + total);	 
	 }

}
