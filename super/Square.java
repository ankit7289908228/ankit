class Square extends Shape
{
	double side ;
	Square()
	{
		side=1;

	}
	Square(double side,String color,boolean filled)
	{
		super(color,filled);
		this.side=side;

	}
	double getSide()
	{
		return side;
	}
	void setSide(double side)
	{
		this.side=side;

	}
	double getPe()
	{
      return 4*side;

	}
	double getArea()

	{
		return side*side;

	}
	  public String toString()
  {
  	return("Area"+getArea()+"perimeter"+getPe());

  }

}