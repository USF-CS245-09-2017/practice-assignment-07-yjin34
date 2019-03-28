// the assert class to prevent errors
public class Assert
{
	// if the boolean is false, throw the exception
	public static boolean notfalse(boolean boo)
	{
		if(boo)
		{
			return true;
		}
		throw new Exception("Error!");
	}
}
