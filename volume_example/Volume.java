public class Volume
{
	double volume = 0;
	double length = 0;
	double breadth = 0;
	double height = 0;
	double side = 0;

	public Volume(double side)
	{
		this.side = side;//global side = local side
		
		//volume = this.side * this.side * this.side;
	}

	public Volume(double length, double breadth, double height)
	{
		this.length = length;
		this.breadth = breadth;
		this.height = height;

		volume = this.length * this.breadth * this.height;
	}

	public void Vcalcolume(int s)
	{
		volume = side*side*side;
	}

	public void printThis()
	{
		System.out.println("The volume of the figure is " + volume);
	}
}