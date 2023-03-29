package Assignment1;

public class Bike {
	public void applybreak()
	{
		System.out.println("Bike Apply Break");
	}
public void soundhorn()
{
	System.out.println("Bike Sound The Horn");
}
	public static void main(String[] args) 
	{
	car scarpio=new car();
	scarpio.applybreak();
	scarpio.soundhorn();
	Bike royalenfield=new Bike();
	royalenfield.applybreak();
	royalenfield.soundhorn();
	}

}
