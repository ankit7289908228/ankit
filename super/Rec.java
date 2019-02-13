class Rectangle extends Shape

{
	private double width;
	private double length;
	Rectangle()
	{
		this.length=1;
		this.width=1;

	}
	Rectangle(double width,double length)
	{
		this.length=length;
		this.width=width;

	}
	Rectangle(double width,double length,String color,boolean filled)
	{
		super(color,filled);
		this.length=length;
		this.width=width;
	}
	double getWidth()
	{
		return this.width;

	}
	double getlength()
	{
		return this.length;

	}
	void setwidth()
	{
      this.width=width;

	}
	void setlength()
	{ this.length=length;


	}
	double getPe()
	{
      return 2*(length+width);

	}
	double getArea()

	{
		return length*width;

	}
	  public String toString()
  {
  	return("Area"+getArea()+"perimeter"+getPe());

  }

}