public class Cuboid
{
	public static void main(String []args)
	{
		double l = 5;
		double b = 5;
		double h = 5;

		Volume obj = new Volume(l, b, h);
		obj.printThis();
	}
}