package day2assignment2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int fnum=0;
		int snum=1;
		System.out.println(fnum);
		for(int i=1;i<range;i++)
		{
			int sum=fnum+snum;
			fnum=snum;
			snum=sum;
			System.out.println(sum);
		}
		
	}

}
