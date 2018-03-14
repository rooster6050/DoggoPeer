package doggo;

public class DoggoSource 
{
	
	public static void main(String[] args) 
	{
		int input = 5;
		String th = "th";
		String nd = "nd";
		String st = "st";
		String rd = "rd";
		
		for(int x=1;x<=100;x++)
		{
			if(x==input) continue;
			if(x>10 && x<20)
			{
			System.out.print(x+th+", ");
			continue;
			}
			if(x%10 == 1) System.out.print(x+st);
			if(x%10 == 2) System.out.print(x+nd);
			if(x%10 == 3) System.out.print(x+rd);
			if(x%10 >3 || x%10==0) System.out.print(x+th);
			if(x<100) System.out.print(", ");
			
		}
	}

}
