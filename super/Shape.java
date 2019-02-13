abstract class Shape
{
	protected String color;
	protected boolean filled;
	Shape()
	{
		this.color="Red";

	}
	Shape(String color,boolean filled)
	{
		this.color=color;
		this.filled=true;

	}
	String getcolor()
	{
		return color;

	}
	void setcolor(String color)
	{
		this.color=color;

	}
	void setFilled(boolean filled)
	{
		this.filled=filled;

	}
	boolean isFilled()
	{
		return filled;

	}
	abstract double getArea();
	abstract double getPe();
    abstract public String toString();
    
}