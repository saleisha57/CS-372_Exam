public class Circle implements Shape
{
    int ID;
    int radius;
    
    public Circle()
    {
	
    }
    
    public String to_string()
    {
	return getKind() + " (ID#" + getID() + ")\n";
    }


    public String getKind()
    {
	return "Circle";
    }


    public String getDetailString()
    {
	return to_string() + "Color: Yellow\nRadius: " + radius + "\nArea: " + getArea() + "\nPerimeter: " + getPerim();
    }
    
    public double getArea()
    {
	double area = 3.14 * (radius * radius);
	return area;
    }
    
    public double getPerim()
    {
	double perimeter = 2*3.14*radius;
	return perimeter;
    }

    
    public void set_rad(int rad)
    {
	radius = rad;
	System.out.println(radius);
    }

    
    public void setID(int id)
    {
	ID = id;
    }


    public int getID()
    {
	return 0;
    }

}


