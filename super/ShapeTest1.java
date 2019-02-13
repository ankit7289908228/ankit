import java.util.*;
class ShapeTest1{
	public static void main(String []args)
	{
		Scanner scan=new Scanner();
		Shape s=new Shape();
		system.out.println("enter the dimension of Rectangle:");
		float l=scan.nextFloat();
		float b=scan.nextFloat();
		Rectangle r=new Rectangle(l,b);

		System.out.println("enter the side of the square:");
		float s=scan.nextFloat();
		s=scan.nextFloat();
		Square sq=new Square(s);

		System.out.println("enter the dimension of circle:");
		float r=scan.nextFloat();
		Circle cr=new Circle(r);

		System.out.println("Shape:"+s.toString());
		System.out.println("Rectangle:"+r.toString());
		System.out.println("Square:"+sq.toString());
		System.out.println("Circle:"+cr.toString());



	}

}