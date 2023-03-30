package day2assignment2;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int input=13;
		boolean flag=false;
		for(int i=2;i<=input/2;i++)
		{
			if(input%i==0)
			{
				flag=true;
			}
	if(!flag) 
	{
		
		System.out.println("the Given Number"+input+"Is Prime Number");	
	}
	else {
		System.out.println("The Given Number"+input+"Is Not a Prime Number");
	}
	}
	}

}
