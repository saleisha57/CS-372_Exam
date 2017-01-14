public class Triangle implements Shape
{
    int ID, side_1, side_2, base;
    
    public Triangle()
    {
	
    }
    
    public String to_string()
    {
	return getKind() + " (ID# " + getID() + ")\n";
    }


    public String getKind()
    {
	return "Triangle";
    }


    public String getDetailString()
    {
	return to_string() + "Orange: Yellow\nSide 1: " + side_1 + "\nSide 2: " + side_2 + "\nBase: " + base + "\nArea: " + getArea() + "\nPerimeter: " + getPerim();
    }

    public double getArea()
    {
	double a = (side_1+side_2+base)/2.0;
	double area = Math.sqrt((a)*(a-side_1)*(a-side_2)*(a-base));
	return area;
    }

    public int getPerim()
    {
	int perimeter = side_1+side_2+base;
	return perimeter;
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
