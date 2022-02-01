public class Cube
{
	public static void main(String []args)
	{
		double s = 0;
		s = 5;

		Volume obj = new Volume(s);
		obj.calcVolume(10);
		obj.printThis();
	}
}