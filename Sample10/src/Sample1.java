
public class Sample1 
{
public static void main (String[]args)
{
	int no=10;
	String x= Nags("MANJU");
	System.out.println(x);
	System.out.println(no);

}
public static String Nags(String name)
{
	
	if(name.equals("NAGU")) {
		System.out.println("this guy is super");	
	}
	else if(name.equals("MANJU")) {
		System.out.println("ok");
	}
	else 
	{
		System.out.println("i dont know this guy");
	}
	return name;
}


}

