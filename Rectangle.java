package testcase;

public class Rectangle {
	protected double width;
	protected double length;
	public int height;
	public void setRectangle(double width, double length)
	{
		this.width=width;
		this.length=length;
	}
	public double Area()
	{
		return length*width*height;
	}
	

}
