class Circle extends Shape

{
  private double radii;
  Circle()
  {
  	this.radii=0;

  }
  Circle(double radii,String color,boolean filled)
  {
  	super(color,filled);

  	this.radii=radii;
    
  }
  double getRadii()
  {
  	return radii;

  }
  void setRadii()
  {
  	this.radii=radii;

  }
  double getArea()
  {
    return (3.14*radii*radii);

  }
  double getPe()
  {
   return (3.14*2*radii);

  }
  public String toString()
  {
  	return("Area"+getArea()+"perimeter"+getPe());

  }


}