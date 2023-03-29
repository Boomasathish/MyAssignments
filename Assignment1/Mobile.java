package Assignment1;

public class Mobile 
{
	public void makecall()
{	
String mobileModel="oneplus";
System.out.println(mobileModel);
float mobileWeight=57.3f;
System.out.println(mobileWeight);	
}
public void sendmsg()
{
 boolean FullCharged=true;
 System.out.println(FullCharged);
 int mobilecost=23000;
 System.out.println(mobilecost);
 }
public static void main(String[] args) 
	{
	Mobile vivo=new Mobile();
	vivo.makecall();
	vivo.sendmsg();
	System.out.println("This is my mobile");
	
	}	
}
	




