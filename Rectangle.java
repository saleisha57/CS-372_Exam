public class Rectangle implements Shape
{
    int ID, side_1, side_2;
    
    public Rectangle()
    {
	
    }
    
    public String to_string()
    {
	return getKind() + " (ID# " + getID() + ")\n";
    }


    public String getKind()
    {
	return "Rectangle";
    }


    public String getDetailString()
    {
	return to_string() + "Green: Yellow\nSide 1: " + side_1 + "\nSide 2: " + side_2 + "\nArea: " + getArea() + "\nPerimeter: " + getPerim();
    }

    public int getArea()
    {
	int area = side_1 * side_2;
	return area;
    }

    public int getPerim()
    {
	int perimeter = side_1+side_2+side_1+side_2;
	return perimeter;
    }


    public void set_side_1(int s_1)
    {
	side_1 = s_1;
    }
    
    public void set_side_2(int s_2)
    {
	side_2 = s_2;
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
